/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lon;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nhuan's computer
 */


public class CSDL {

    private String UserID;
    public CSDL(){
        
    }
    //gọi 1 cơ sở dữ liệu mysql
    public static Connection jdbcConnection(){
        String url="jdbc:mysql://localhost:3306/quanlisuckhoe";
        String user="root";
        String password = "5122001t";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }
        return null;
    }
    //in dữ liệu lấy từ mysql
    public static void statement(){
        try{
            Statement sta=jdbcConnection().createStatement();
            String select="SELECT * FROM user";
            ResultSet re=sta.executeQuery(select);
            while (re.next()) {                
                String useeid=re.getString("UserID");
                String hodem=re.getString("HoDem");
                String ten=re.getString("Ten");
                String date=re.getString("NgaySinh");
                String diachi=re.getString("DiaChi");
                String sdt=re.getString("SDT");
                System.out.println(useeid+" "+hodem+" "+ten+" "+date+" "+diachi+" "+sdt);
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    //kiểm tra tài khoản
    public static boolean statement_kiemtrataikhoan(String taikhoan){
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT UserID FROM taikhoan";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String tk=re.getString("UserID");
                if(tk.equalsIgnoreCase(taikhoan)==true) return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean statement_kiemtrataikhoanvamatkhau(String taikhoan, String  matkhau) throws SQLException{
        Statement sta=jdbcConnection().createStatement();
        String where="SELECT * FROM taikhoan";
        ResultSet re=sta.executeQuery(where);
        while (re.next()) {                
            String tk=re.getString("UserID");
            String mk = re.getString("MatKhau");
            if(tk.equalsIgnoreCase(taikhoan)==true && mk.equalsIgnoreCase(matkhau) == true) return true;
        }
        return false;
    }
    
    public static boolean adminOrNot(String taikhoan, String  matkhau) throws SQLException {
        Statement sta=jdbcConnection().createStatement();
        String where="SELECT * FROM taikhoan";
        ResultSet re=sta.executeQuery(where);
        while (re.next()) {                
            String tk=re.getString("UserID");
            String mk = re.getString("MatKhau");
            String bool = re.getString("isAdmin");
            if(tk.equalsIgnoreCase(taikhoan)==true && mk.equalsIgnoreCase(matkhau) == true && bool.equalsIgnoreCase("YES")) 
                return true;
        }
        return false;
    }
    
    //kiểm tra mật khẩu
    public static boolean statement_kiemtramatkhau(String matkhau){
        try {
            Statement sta=jdbcConnection().createStatement();
            String where="SELECT MatKhau FROM taikhoan WHERE";
            ResultSet re=sta.executeQuery(where);
            while (re.next()) {                
                String mk=re.getString("MatKhau");
                if(mk.equalsIgnoreCase(matkhau)==true) return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    //đưa dữ liệu về bảng user của cơ sở dữ liệu mysql
    public static boolean insert_into_user(String id, String hodem, String ten, String ngaysinh, String diachi, String sdt){
        try {
            if(id.equalsIgnoreCase("")==true|| hodem.equalsIgnoreCase("")==true|| ten.equalsIgnoreCase("")==true|| ngaysinh.equalsIgnoreCase("")==true|| diachi.equalsIgnoreCase("")==true|| sdt.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into user values(?,?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, hodem);
            ps.setString(3, ten);
            ps.setString(4, ngaysinh);
            ps.setString(5, diachi);
            ps.setString(6, sdt);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //đưa dữ liệu về bảng admin của cơ sở dữ liệu mysql
    public static boolean insert_into_admin(String id, String hoten, String SDT, String email){
        try {
            if(id.equalsIgnoreCase("")==true|| hoten.equalsIgnoreCase("")==true|| SDT.equalsIgnoreCase("")==true|| email.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into admin values(?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, hoten);
            ps.setString(3, SDT);
            ps.setString(4, email);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //đưa dữ liệu về bảng tài khoản của mysql
     public static boolean insert_into_taikhoan(String id, String matkhau, String isAdmin){
        try {
            if(id.equalsIgnoreCase("")==true|| matkhau.equalsIgnoreCase("")==true) 
                return false;
            String insert="insert into taikhoan values(?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, id);
            ps.setString(2, matkhau);
            ps.setString(3, isAdmin);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //nhap thong tin hang ngay vao co so du lieu by tanhdz
    public static boolean insert_into_nhap_thong_tin_hang_ngay(String UserId,String day,String CanNang,String ChieuCao,String BMI,String TheTrang){
        try{
            if(ChieuCao.equalsIgnoreCase("")||CanNang.equalsIgnoreCase("")) return false;
            String insert="insert into nhapthongtinvaloikhuyen values(?,?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, UserId);
            ps.setString(2, day);
            Double chieucao=Double.valueOf(ChieuCao);//format sang by tanhdz
            Double cannang=Double.valueOf(CanNang);
            Double bmi=Double.valueOf(BMI);
            ps.setDouble(3, chieucao);
            ps.setDouble(4, cannang);
            ps.setDouble(5, bmi);
            ps.setString(6, TheTrang);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
            //cap nhat xong by tanhdz
        } catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    // Đọc ID từ file
    public static String ReadIDFromFile() throws FileNotFoundException, IOException {
        String s="";
        FileReader fr;
        fr = new FileReader("src\\bai_tap_lon\\luuID.txt");
        int i;
        while((i=fr.read())!=-1){
            s+= (char)i;
        }
        return s;
    }
    
   // Ghi ID vào File
    public static void WriteIDToFile(String id) throws IOException {
        FileWriter fw;
        fw = new FileWriter("src\\bai_tap_lon\\luuID.txt");
        fw.write(id);
        fw.close();
    }
    
   /**
     *
     * @return
     * @throws IOException
     */
    
    public static int compareDates(String psDate1, String psDate2) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/yyyy HH:MM:SS");
        java.util.Date date1 = dateFormat.parse(psDate1);
        java.util.Date date2 = dateFormat.parse(psDate2);
        if(date2.after(date1)) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public static Vector<String> statement_hien_thi_thong_tin_nguoi_dung() throws IOException, ParseException, SQLException {
       Vector<String> res = new Vector<>();
       ArrayList<String> listTime = new ArrayList<>(); 
       ArrayList<ArrayList<String>> in = new ArrayList<>();
        try{
            Statement sta=jdbcConnection().createStatement();
            String id = ReadIDFromFile();
            String select= "SELECT user.*,\n" +
                            "nhapthongtinvaloikhuyen.ChieuCao, nhapthongtinvaloikhuyen.CanNang, nhapthongtinvaloikhuyen.BMI, nhapthongtinvaloikhuyen.TheTrang, nhapthongtinvaloikhuyen.Day\n" +
                            "FROM user, nhapthongtinvaloikhuyen \n" +
                            "WHERE user.UserID = " + "\'" + id + "\'" + 
                            "AND user.UserID = nhapthongtinvaloikhuyen.UserID;";
                           
            ResultSet re=sta.executeQuery(select);
            while(re.next()) {
                ArrayList<String> temp = new ArrayList<>();
                String userid=re.getString("UserID");
                String hodem=re.getString("HoDem");
                String ten=re.getString("Ten");
                String date=re.getString("NgaySinh");
                String diachi=re.getString("DiaChi");
                String sdt=re.getString("SDT");
                String chieuCao = re.getString("ChieuCao");
                String canNang = re.getString("CanNang");
                String bmi = re.getString("BMI");
                String theTrang = re.getString("TheTrang");
                String time = re.getString("Day");
                listTime.add(time);
                temp.add(userid);
                temp.add(hodem);
                temp.add(ten);
                temp.add(date);
                temp.add(diachi);
                temp.add(sdt);
                temp.add(chieuCao);
                temp.add(canNang);
                temp.add(bmi);
                temp.add(theTrang);
                temp.add(time);
//                System.out.println(chieuCao);
                in.add(temp);
            }

            Collections.sort(listTime, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String[] t1 = o1.split("\\s+");
                    String[] s11 = t1[0].split("-");
                    String[] s12 = t1[1].split(":");
                    Integer[] t11 = {Integer.parseInt(s11[0]), Integer.parseInt(s11[1]), Integer.parseInt(s11[2])};
                    Integer[] t12 = {Integer.parseInt(s12[0]), Integer.parseInt(s12[1]), Integer.parseInt(s12[2])};
                    
                    String[] t2 = o2.split("\\s+");
                    String[] s21 = t2[0].split("-");
                    String[] s22 = t2[1].split(":");
                    Integer[] t21 = {Integer.parseInt(s21[0]), Integer.parseInt(s21[1]), Integer.parseInt(s21[2])};
                    Integer[] t22 = {Integer.parseInt(s22[0]), Integer.parseInt(s22[1]), Integer.parseInt(s22[2])};
                    
                    if(s11[2].equals(s21[2])) {
                        if(s11[1].equals(s21[1])) {
                            if(s11[0].equals(s21[0])) {
                                if(s12[0].equals(s22[0])) {
                                    if(s12[1].equals(s22[1])) {
                                        return s12[2].compareTo(s22[2]);
                                    }
                                    return s12[1].compareTo(s22[1]);
                                }
                                return s12[0].compareTo(s22[0]);
                            }
                            return s11[0].compareTo(s21[0]);
                        }
                        return s11[1].compareTo(s21[1]);
                    }
                    return s11[2].compareTo(s21[2]);
                }
            });
//            
        }catch(SQLException e){
            System.out.println(e);
        }
        for(int i = 0;i < listTime.size(); i++) {
            System.out.println(listTime.get(i));
        }
        Statement sta=jdbcConnection().createStatement();
        String id = ReadIDFromFile();
        String select= "SELECT * FROM user WHERE UserID = \'" + id + "\';";
        ResultSet re=sta.executeQuery(select);
        if(listTime.size() == 0) {
            while(re.next()) {
                String userid=re.getString("UserID");
                String hodem=re.getString("HoDem");
                String ten=re.getString("Ten");
                String date=re.getString("NgaySinh");
                String diachi=re.getString("DiaChi");
                String sdt=re.getString("SDT");
                res.add(userid);
                res.add(hodem);
                res.add(ten);
                res.add(date);
                res.add(diachi);
                res.add(sdt);
                res.add("\t");
                res.add("\t");
                res.add("");
                res.add("");
            }
                
        }
        else {
            String finalTime = listTime.get(listTime.size() - 1);

            for(int i = 0;i < in.size(); i++) {
                if(in.get(i).get(10).equals(finalTime)) {
                    res.add(in.get(i).get(0));
                    res.add(in.get(i).get(1));
                    res.add(in.get(i).get(2));
                    res.add(in.get(i).get(3));
                    res.add(in.get(i).get(4));
                    res.add(in.get(i).get(5));
                    res.add(in.get(i).get(6));
                    res.add(in.get(i).get(7));
                    res.add(in.get(i).get(8));
                    res.add(in.get(i).get(9));
                    break;
                }    
            }
        }
            
       return res;
   }
    
    // Sửa thông tin người dùng
    public static void statement_sua_thong_tin_nguoi_dung(String hodem, String ten, String dob, String address, String phone) throws IOException {
        try{
            Statement sta=jdbcConnection().createStatement();
            String id = ReadIDFromFile();
            String update = "UPDATE user\n" +
                            "SET HoDem = " + "\'" + hodem + "\',\n" +
                                "Ten = " + "\'" + ten + "\',\n" +
                                "NgaySinh = " + "\'" + dob + "\',\n" +
                                "DiaChi = " + "\'" + address + "\',\n"  +
                                "SDT = " + "\'" + phone + "\'\n"  +
                            "WHERE UserID = " + "\'" + id + "\';" ;
            sta.executeUpdate(update);
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    
    public static Vector<String> statement_luyen_tap_dinh_duong() throws SQLException, IOException {
        Vector<String> res = new Vector<>();
        Statement sta=jdbcConnection().createStatement();
        String id = ReadIDFromFile();
        String tt = null;
        String select= "SELECT user.*,\n" +
                            "nhapthongtinvaloikhuyen.ChieuCao, nhapthongtinvaloikhuyen.CanNang, nhapthongtinvaloikhuyen.BMI, nhapthongtinvaloikhuyen.TheTrang, nhapthongtinvaloikhuyen.Day\n" +
                            "FROM user, nhapthongtinvaloikhuyen \n" +
                            "WHERE user.UserID = " + "\'" + id + "\'" + 
                            "AND user.UserID = nhapthongtinvaloikhuyen.UserID;";
                           
        ResultSet re=sta.executeQuery(select);
        while(re.next()) {
            tt = re.getString("TheTrang");
        }
        if(tt == null)
            tt = "Bình thường";
        Statement state=jdbcConnection().createStatement();
        String selectTheTrang = "SELECT * From loikhuyen WHERE TheTrang = " + "\'" + tt + "\';";
        re = state.executeQuery(selectTheTrang);
        while(re.next()) {
            tt = re.getString("TheTrang");
            String tapLuyen = re.getString("TapLuyen");
            String dinhDuong = re.getString("DinhDuong");
            res.add(tt);
            res.add(tapLuyen);
            res.add(dinhDuong);
        }
        return res;
    }
    
    
    // cập nhật trung tâm
    public static boolean insert_into_trungtam(String IDtrungtam,String TenTrungTam,String Tinh,String DiaChiCuThe,String sdt){
        try{
            if(IDtrungtam.equalsIgnoreCase("")||TenTrungTam.equalsIgnoreCase("")||Tinh.equalsIgnoreCase("")||DiaChiCuThe.equalsIgnoreCase("")||sdt.equalsIgnoreCase(""))
                    return false;
            String insert="insert into trungtam values(?,?,?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, IDtrungtam);
            ps.setString(2, TenTrungTam);
            ps.setString(3, Tinh);
            ps.setString(4, DiaChiCuThe);
            ps.setString(5, sdt);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        }
        catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    //cap nhat them admin nào nhập trung tâm nào
    public static boolean insert_into_capnhattrungtam(String IDadmin,String IDTrungTam,String date){
        try{
            String insert="insert into capnhattrungtam values(?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, IDadmin);
            ps.setString(2, IDTrungTam);
            ps.setString(3, date);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        }
        catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    //update loi khuyen
    public static boolean update_loi_khuyen(String TheTrang,String TapLuyen,String DinhDuong){
        try{
            if(TapLuyen.equalsIgnoreCase("")||DinhDuong.equalsIgnoreCase(""))
                    return false;
            String update="UPDATE loikhuyen "
                    + "SET TapLuyen=?"
                    + ", DinhDuong=?"
                    + "WHERE TheTrang=?";
            PreparedStatement ps=jdbcConnection().prepareStatement(update);
            ps.setString(1, TapLuyen);
            ps.setString(2, DinhDuong);
            ps.setString(3, TheTrang);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        }
        catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public static boolean insert_into_cap_nhat_loi_khuyen(String IDadmin,String thetrang,String date){
        try{
            String insert="insert into capnhatloikhuyen values(?,?,?)";
            PreparedStatement ps=jdbcConnection().prepareStatement(insert);
            ps.setString(1, IDadmin);
            ps.setString(2, thetrang);
            ps.setString(3, date);
            int n=ps.executeUpdate();
            if(n!=0)return true;
            return false;
        }
        catch(SQLException e){
            Logger.getLogger(CSDL.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    public static void statement_xoa_tk() throws SQLException, IOException {
        Statement sta=jdbcConnection().createStatement();
        String id = ReadIDFromFile();
        String select= "DELETE FROM user WHERE UserID = \'" + id + "\';";
        sta.executeUpdate(select);
        select= "DELETE FROM nhapthongtinvaloikhuyen WHERE UserID = \'" + id + "\';";
        sta.executeUpdate(select);
        select= "DELETE FROM taikhoan WHERE UserID = \'" + id + "\';";
        sta.executeUpdate(select);
        
    }
}
