package practice;
public class StringDisplay extends AbstractDisplay{
    //string: 표시해야 하는 문자열 
    private String string="";
    // width: 문자열의 길이
    private int width=0;

    public StringDisplay(String string){
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open(){
        printLine();
    }

    @Override
    public void print(){
        System.out.println("|"+string+"|");
    }

    @Override
    public void close(){
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i=0; i<width;i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
