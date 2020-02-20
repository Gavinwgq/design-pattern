Sunny软件公司欲开发一个基于Windows平台的公告板系统。该系统提供了一个主菜单
(Menu)，在主菜单中包含了一些菜单项(MenuItem)，可以通过Menu类的addMenuItem()方
法增加菜单项。菜单项的主要方法是click()，每一个菜单项包含一个抽象命令类，具体命
令类包括OpenCommand(打开命令)，CreateCommand(新建命令)，EditCommand(编辑命令)
等，命令类具有一个execute()方法，用于调用公告板系统界面类(BoardScreen)的open()、
create()、edit()等方法。试使用命令模式设计该系统，以便降低MenuItem类与BoardScreen
类之间的耦合度。