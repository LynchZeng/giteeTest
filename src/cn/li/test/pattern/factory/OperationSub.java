package cn.li.test.pattern.factory;


public class OperationSub extends Operation{
	@Override
	public double getResult() {
		return numberA-numberB;
	}
}
