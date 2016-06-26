## 0. User


## 1. Question 问题
```
{
	id                int(11)    //question id
	content           varchar(3000)  //question tital
	question_type_id  int(11)
	answer			  
	order             int(11)     //问题的排序
	survey_id         int(11)
	created_time      datetime
	updated_time	  datetime
	is_deleted        tinyint(1)
}
```

## 2. Question Type 问题类型
```
{
	id               int(11)
	name             varchar(100) //支持1.单选题，2多选题，3简答题
	code             varchar(100) //1.choice, 2.checkbox, 3. input
}
```

## 3. Option 单选题多选题的选项
```
{
	id            int(11)
	question_id   int(11)
	content       varchar(3000)
	order         int(11)
}
```

## 4. Survey问卷表
```
{
	id             int(11)
	title          varchar(100)
	description    varchar(1000)
	status         varchar(10) //问卷的状态
	is_publish     tinyint(1) //是否发布
	published_time datetime
	start_time     datetime
	end_time       datetime
	create_time    datetime
	update_time    datetime
	is_deleted     tinyint(1)
}
```

## 5. Survey Log//记录问卷做大信息
