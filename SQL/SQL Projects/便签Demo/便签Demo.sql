create database if not exists memo charset=utf8 collate utf8_general_ci;
use memo;

--1.便签组表(主表)

    --编号    -- 组名称    -- 创建时间    -- 修改时间    -- 删除时间

create table if not exists notes_group(
	id int primary key auto_increment comment'便签组编号',
	group_name varchar(10) unique comment'组名称',
	create_time datetime comment'创建时间',
	alter_time timestamp comment'修改时间',
	delete_time datetime comment'删除时间'
);


---2.便签表

    -- 编号    --标题    -- 内容    -- 是否私密    -- 背景颜色    -- 是否提醒    -- 提醒时间    -- 创建时间
    -- 修改时间    -- 是否删除    -- 删除时间    -- 便签组编号

create table if not exists notes(
	id int primary key auto_increment comment'便签编号',
	title varchar(20) not null comment'便签标题',
	contect varchar(200) comment'便签内容',
	if_secret boolean default 0 comment'是否私密;0为公开,1为私密',
	backup enum('red','yellow','green','blue') default 'green' comment'背景颜色',
	if_remind bit(1) default 0 comment'是否提醒;0为不提醒,1为提醒',
	remind_time datetime comment'提醒时间',
	create_time datetime comment'创建时间',
	alter_time timestamp comment'修改时间',
	if_delete char(1) default 0 comment'是否删除;0为保留,1为删除',
	delete_time datetime comment'删除时间',
	group_id int default 0 comment'便签组编号',
	foreign key(group_id) references notes_group(id)
);


--3.便签分享表

    --编号    --便签编号    -- 分享备注    -- 分享时间    -- 删除时间

create table if not exists notes_share(
	id int primary key auto_increment comment'便签分享编号',
	note_id int not null comment'便签编号',
	share_mark varchar(50) comment'分享备注',
	share_time datetime comment'分享时间',
	delete_time datetime comment'删除时间',
	foreign key(note_id) references notes(id)
);