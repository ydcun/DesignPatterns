package tmeplate;

/**
 * @author ydcun
 *试卷
 */
abstract class TestPaper {
	public String getTest1(){
		return "这是第一题";
	}
	public String getTest2(){
		return "这是第二题";
	}
	public String getTest3(){
		return "这是第三题";
	}
	//分别回答上面三题目
	abstract void answer1();
	abstract void answer2();
	abstract void answer3();
}
