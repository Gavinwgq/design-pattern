Sunny软件公司欲为数据库备份和同步开发一套简单的数据库同步指令，通过指令可以对
数据库中的数据和结构进行备份，例如，输入指令<br/>
**“COPY VIEW FROM srcDB TO desDB”**<br/>
表示**将数据库srcDB中的所有视图(View)对象都拷贝至数据库desDB**；<br/>
输入指令<br/>
**“MOVE TABLE Student FROM srcDB TO desDB”**<br/>
表示**将数据库srcDB中的Student表移动至数据库desDB**。<br/>
试使用解释器模式来设计并实现该数据库同步指令。