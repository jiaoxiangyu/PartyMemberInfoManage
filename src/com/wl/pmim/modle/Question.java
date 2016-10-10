package com.wl.pmim.modle;
/*
 * 试题类
 * 属性：id、A选项、B选项、C选项、D选项、正确答案、解析
 */

public class Question {
	private int  qt_Id;
	private String A;
	private String B;
	private String C;
	private String D;
	private String answer;
	private String analysis;
	public int getQt_Id() {
		return qt_Id;
	}
	public void setQt_Id(int qt_Id) {
		this.qt_Id = qt_Id;
	}
	public String getA() {
		return A;
	}
	public void setA(String a) {
		A = a;
	}
	public String getB() {
		return B;
	}
	public void setB(String b) {
		B = b;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getD() {
		return D;
	}
	public void setD(String d) {
		D = d;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnalysis() {
		return analysis;
	}
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	public String toString() {
		return "Question [qt_Id=" + qt_Id + ", A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", answer=" + answer
				+ ", analysis=" + analysis + "]";
	}   
}
