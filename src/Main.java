import java.io.File;

public class Main {
	public static String directory = "D:\\Desktop\\study in UO\\RBCeStatement 201703\\credit card2";
	public static void main(String[] args) {
		String[] monthCharacter = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		String[] monthDigit = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
		File file = new File(directory);
		
	    /** ��������ļ��У��ͷ���* */
	    if(!file.isDirectory()){
	        System.out.println(directory + "����һ���ļ��У�");
	        return;
	    }
	
	    String[] fileNames = file.list();
	    File f = null;
	    String newFileName = ""; //֮ǰ������
	    /** ѭ�����������ļ�* */
	    for(String fileName : fileNames){
	    	newFileName = fileName;
	        for(int i = 0; i < 12; i++) {
	        	newFileName = newFileName.replace(monthCharacter[i], monthDigit[i]);
	        }
	
	        f = new File(directory + "\\" + fileName); //�����ַ��ԭ·������һ��
	        f.renameTo(new File(directory + "\\" +  newFileName));
	    }
	    System.out.println("��ϲ�������������ɹ���");
	}
}
