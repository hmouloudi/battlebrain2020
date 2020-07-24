SET character_set_client = utf8;
SET character_set_results = utf8;
SET character_set_connection = utf8;


insert into floors (floor_number) values (3);
insert into floors (floor_number) values (4);
insert into floors (floor_number) values (5);


insert into areas (area_code,floor_pk) values ('A',(select pk from floors where floor_number='3'));
insert into areas (area_code,floor_pk) values ('B',(select pk from floors where floor_number='3'));

insert into areas (area_code,floor_pk) values ('A',(select pk from floors where floor_number='4'));
insert into areas (area_code,floor_pk) values ('B',(select pk from floors where floor_number='4'));

insert into areas (area_code,floor_pk) values ('A',(select pk from floors where floor_number='5'));
insert into areas (area_code,floor_pk) values ('B',(select pk from floors where floor_number='5'));


insert into rooms (room_name,area_pk) values ('room_alpha',(select pk from areas where area_code='A' and floor_pk = (select pk from floors where floor_number='4')));
insert into rooms (room_name,area_pk) values ('room_beta',(select pk from areas where area_code='A' and floor_pk = (select pk from floors where floor_number='4')));
insert into rooms (room_name,area_pk) values ('room_gama',(select pk from areas where area_code='B' and floor_pk = (select pk from floors where floor_number='4')));
insert into rooms (room_name,area_pk) values ('room_omega',(select pk from areas where area_code='B' and floor_pk = (select pk from floors where floor_number='4')));

insert into desks (desk_code,desk_size,room_pk) values ('100000',6,(select pk from rooms where room_name='room_alpha'));
insert into desks (desk_code,desk_size,room_pk) values ('100001',4,(select pk from rooms where room_name='room_alpha'));
insert into desks (desk_code,desk_size,room_pk) values ('100002',6,(select pk from rooms where room_name='room_alpha'));
insert into desks (desk_code,desk_size,room_pk) values ('100003',6,(select pk from rooms where room_name='room_alpha'));
insert into desks (desk_code,desk_size,room_pk) values ('100004',2,(select pk from rooms where room_name='room_alpha'));

insert into seats (seat_number,desk_pk) values ('1',(select pk from desks where desk_code='100000'));
insert into seats (seat_number,desk_pk) values ('2',(select pk from desks where desk_code='100000'));
insert into seats (seat_number,desk_pk) values ('3',(select pk from desks where desk_code='100000'));
insert into seats (seat_number,desk_pk) values ('4',(select pk from desks where desk_code='100000'));
insert into seats (seat_number,desk_pk) values ('5',(select pk from desks where desk_code='100000'));
insert into seats (seat_number,desk_pk) values ('6',(select pk from desks where desk_code='100000'));

insert into seats (seat_number,desk_pk) values ('1',(select pk from desks where desk_code='100001'));
insert into seats (seat_number,desk_pk) values ('2',(select pk from desks where desk_code='100001'));
insert into seats (seat_number,desk_pk) values ('3',(select pk from desks where desk_code='100001'));
insert into seats (seat_number,desk_pk) values ('4',(select pk from desks where desk_code='100001'));
