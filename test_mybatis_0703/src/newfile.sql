create table t_users(
	u_id number primary key,
	u_name varchar2(20),
	u_pwd varchar2(20),
	realname varchar2(20)
)
select r_id from t_roles where rolename='super管理员'
select u_id as u_id,u_name as uname,u_pwd as upwd ,realname as realname from t_users where u_id in(select userid from t_user_role where roleid in(select r_id from t_roles where rolename='super管理员'));
select 
		*
		from t_users tu inner join t_user_role tur on tu.u_id=tur.userid
		inner join t_roles tr on tur.roleid=tr.r_id
		where tr.r_id=2
		
		
insert into t_users(u_name,u_pwd,realname) values('zhangsan','123456','张三');
insert into t_users(u_name,u_pwd,realname) values('lisi','123456','李四');
insert into t_users(u_name,u_pwd,realname) values('wangwu','123456','王五');
insert into t_users(u_name,u_pwd,realname) values('zhaoliu','123456','赵六');
insert into t_users(u_name,u_pwd,realname) values('sunqi','123456','孙七');

create sequence seq_t_users;

create or replace trigger tri_t_users
before insert
on t_users
for each row
begin
    select seq_t_users.nextval into :new.u_id from dual;
end;

create table t_roles(
	r_id number primary key,
	rolename varchar2(20),
	demo varchar2(50)
);
insert into t_roles(rolename,demo) values('super管理员','超级用户');
insert into t_roles(rolename,demo) values('管理员','普通管理');
insert into t_roles(rolename,demo) values('用户','普通用户');

create sequence seq_t_roles;

create or replace trigger tri_t_roles
before insert
on t_roles
for each row
begin
    select seq_t_roles.nextval into :new.r_id from dual;
end;

create table t_user_role(
	userid number references t_users(u_id),
	roleid number references t_roles(r_id)
);
select count(distinct userid) from t_user_role
insert into t_user_role(userid,roleid) values(1,1);
insert into t_user_role(userid,roleid) values(1,2);
insert into t_user_role(userid,roleid) values(2,1);
insert into t_user_role(userid,roleid) values(3,2);
insert into t_user_role(userid,roleid) values(4,2);