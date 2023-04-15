

// 어댑터 /(위임을 이용함)
public class PrintBanner extends Print{
    // 자신이 할 일으 banner 클래스의 인스턴스에게 맡김
    //banner에게 위임
    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak(){
        banner.showWithParen();
    }


    @Override
    public void printStrong(){
        banner.showWithAster();
    }
}
