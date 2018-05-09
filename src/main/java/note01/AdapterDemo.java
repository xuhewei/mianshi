package note01;

public class AdapterDemo {
	public static void main(String[] args){
		Button btn = new Button();
		//
		Button btn1 = new Button();
		btn1.setLister(new MouseAdapter(){
			public void onClick(){
				System.out.println("点击了一下");
			}
		});
		btn1.click();
		
		//方法链式编成
		new Button().setLister(new MouseAdapter(){
			public void onClick(){
				System.out.println("点击了1下");
			}
			public void onDbClick(){
				System.out.println("点击了2下");
			}
		}).click()
		.dbClick();
	}
}
//按钮
class Button{
	private MouseLister mouseLister;
	
	public Button setLister(MouseLister mouseLister){
		this.mouseLister=mouseLister;
		return this;
	}
	
	public Button click(){
		mouseLister.onClick();
		return this;
	}
	public Button dbClick(){
		mouseLister.onDbClick();
		return this;
	}
}
//接口
interface MouseLister{
	public void onClick();
	public void onDbClick();
	public void midClick();
	public void rightClick();
}
//适配器
abstract class MouseAdapter implements MouseLister{
	public void onClick(){}
	public void onDbClick(){}
	public void midClick(){}
	public void rightClick(){}
}