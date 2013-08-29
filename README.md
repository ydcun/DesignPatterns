﻿DesignPatterns
==============

根据《大话设计模式》 实现代码

设计模式：

	1.简单工厂模式：simple_factory_patterns :通过计算机加减乘除法实现演示

	2.策略模式：strategy：通过商店打折活动演示

	3.装饰模式：decorator：通过给小明穿衣服演示

	4.代理模式：proxy：通过找人送礼物的场景演示

	5.工厂模式：factory 通过改进计算机加减乘除案例来演示

	6.原型模式：prototype 通过拷贝来实现创建多个建立对象提高效率

	7.模板模式：template 通过两名学生回答同一份题目来演示

	8.外观模式：facade 通过基金来投资而不是通过直接购买股票


设计原则:
	
	1.单一职责原则：(手机拍摄UFO不清楚)
		1.就一个类而言，应该仅有一个引起它变化的原因
		2.如果一个类承担的职责过多，就等于把这些职责耦合在一起，
		  一个职责的变化就可能会削弱或者抑制这个类完成其他的职责的能力
		  这种耦合会导致脆弱的设计，当变化发生时，设计会遭受到意想不到的破坏
	2.开放-封闭原则：（考研，找工作两不误）
		1.是说软件实体（类，模块，函数）应该可以扩展，但不可修改
		2.做法：在最初编写代码时，假设变化不会发生。当变化发生时，我们就创建抽象来隔离以后发生的同类变化
		3.精神：面对需求的时候，对程序的改动是通过增加新的代码进行的，而不是修改现有的代码
		4.开放-封闭原则是面向对象的核心所在。遵循这个原则可以带来面向对象技术所声称的巨大好处，
		  也就是可维护性，可扩展，可复用，灵活性好。
	3.依赖倒转原则（修电脑，统一接口）
		1.里氏代换原则：子类型必须能够替换掉父类型
		2.抽象不依赖于细节，细节依赖于抽象；要针对接口编程，不要对实现编程
		3.只有当子类可以替换掉父类，软件单位的功能不受到影响，父类才能真正被复用，而子类能在父类基础上添加新行为
		总结：依赖倒转其实可以说是面向对象的标志，用那种语言来编写程序并不重要，如果编写时考虑的都是如何针对抽象编程而不是针对细节编程
		即程序中所有的依赖关系都是终止于抽象类或者接口，那就是面向对象设计，反之就是过程化设计
	4.迪米特法则：（第一天上班，领取电脑IT部门管理问题）
		1.如果两个类不必彼此直接通信，那么这两个类就不应该直接的相互作用。
		2.如果其中一个类需要调用另一个类的某一个方法，可以通过第三者转发这个调用





























