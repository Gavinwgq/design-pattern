在某应用软件中需要记录业务方法的调用日志，在不修改现有业务类的基础上为每一个
类提供一个日志记录代理类，在代理类中输出日志，如在业务方法Method()调用之前输
出“方法Method()被调用，调用时间为2020-02-18 10:10:10”，调用之后如果没有抛异常则
输出“方法Method()调用成功”，否则输出“方法Method()调用失败”。在代理类中调用真实
业务类的业务方法