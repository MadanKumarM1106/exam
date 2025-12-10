public class CRC {
    public static void main(String[] args) throws Exception{
        int crc = 0x1021;
        int polynomial = 0x1021;

        String input= "Hello";

        byte[] bytes = input.getBytes("ASCII");
        for(byte b : bytes){
          for(int i=0; i<8; i++)
          {
            boolean bit = ((b >> (7-i)) & 1)==1;
            boolean c15 = ((crc >> 15) & 1) == 1;

            crc = (crc << 1) & 0xFFFF;
            if(c15 ^ bit){
              crc ^= polynomial;
            }
          }
        }

        

        
        System.out.println("crc16..."+Integer.toHexString(crc).toUpperCase());
    }
}
