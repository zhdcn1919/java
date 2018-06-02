import java.util.Scanner;
public class Id18 {
    int[] weight={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};    //十七位数字本体码权重
    char[] validate={ '1','0','X','9','8','7','6','5','4','3','2'};    //mod11,对应校验码字符值    
    
    public char getValidateCode(String id17){
        int sum = 0;
        int mode = 0;
        for(int i = 0; i < id17.length(); i++){
            sum=sum+Integer.parseInt(String.valueOf(id17.charAt(i)))*weight[i];
        }
        mode = sum % 11;
        return validate[mode];
    }
    
    public static void main(String[] args){
        Id18 test= new Id18();
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入身份证号码的前十七位：");
        System.out.println("该身份证验证码："+test.getValidateCode(sc.next()));    //该身份证校验码：3
    }
}
