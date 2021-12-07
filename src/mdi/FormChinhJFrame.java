/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdi;

import duan1_ui.DangNhapJDialog;
import duan1_ui.DoiMatKhauJDialog;
import duan1_ui.chaoJDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import qlchs.utils.Auth;
import qlchs.utils.XImage;

/**
 *
 * @author Admin
 */
public class FormChinhJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FormChinhJFrame() {
        initComponents();
         setLocationRelativeTo(null);    //cho ra giữa màn hình
//        setExtendedState(JFrame.MAXIMIZED_BOTH);    //cho toàn màn hình 
        dongHo();
        start();
         if (!Auth.isManager()) {
            mniDoanhTthu.setVisible(false);
        }
    }
     private void start() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new chaoJDialog(this, true).setVisible(true);
        new DangNhapJDialog(this, true).setVisible(true);
        lblten.setText(Auth.user.getHoTen());

    }

    public void dongHo() {
        new Timer(1000, new ActionListener() {
            SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");

            @Override
            public void actionPerformed(ActionEvent e) {
                lblClock.setText(sdf.format(new Date()));
            }
        }).start();
    }

    public String getTime() {
        return lblClock.getText();
    }
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnNhap = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnBanSach = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnSach = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnKhachHang = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnThongKe = new javax.swing.JButton();
        DesktopPane = new javax.swing.JDesktopPane();
        lblClock = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDoiMatKhau = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniQlytusach = new javax.swing.JMenuItem();
        mniHoaDon = new javax.swing.JMenuItem();
        mniKeSach = new javax.swing.JMenuItem();
        mniKhachHang = new javax.swing.JMenuItem();
        mniSach = new javax.swing.JMenuItem();
        mniQlyNhanVien = new javax.swing.JMenuItem();
        mnuLichSuKh = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniDoanhTthu = new javax.swing.JMenuItem();
        mniThongkeSach = new javax.swing.JMenuItem();
        mnuXuatNhap = new javax.swing.JMenu();
        mniBanHang = new javax.swing.JMenuItem();
        mniNhapHang = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/iconlogout.png"))); // NOI18N
        jButton1.setText("ĐĂNG XUẤT");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        btnNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/warehouse_30px.png"))); // NOI18N
        btnNhap.setText("NHẬP HÀNG");
        btnNhap.setFocusable(false);
        btnNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnNhap);
        jToolBar1.add(jSeparator2);

        btnBanSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/Bán Hàng.png"))); // NOI18N
        btnBanSach.setText("BÁN HÀNG");
        btnBanSach.setFocusable(false);
        btnBanSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBanSach.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBanSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanSachActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBanSach);
        jToolBar1.add(jSeparator3);

        btnSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/iconBook.png"))); // NOI18N
        btnSach.setText("SÁCH");
        btnSach.setFocusable(false);
        btnSach.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSach.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSachActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSach);
        jToolBar1.add(jSeparator4);

        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/IconKhachHang.png"))); // NOI18N
        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.setFocusable(false);
        btnKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhachHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhachHang);
        jToolBar1.add(jSeparator5);

        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/IconThongke.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setFocusable(false);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongKe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThongKe);

        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(DesktopPane);
        DesktopPane.setLayout(DesktopPaneLayout);
        DesktopPaneLayout.setHorizontalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1265, Short.MAX_VALUE)
        );
        DesktopPaneLayout.setVerticalGroup(
            DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );

        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan1_icon/iconKey.png"))); // NOI18N

        lblten.setText("name:");

        mnuHeThong.setBackground(new java.awt.Color(39, 56, 120));
        mnuHeThong.setText("Hệ thống");

        mniDoiMatKhau.setText("Đổi Mật Khẩu");
        mniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMatKhau);

        mniDangXuat.setText("Đăng Xuất");
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        jMenuBar4.add(mnuHeThong);

        mnuQuanLy.setBackground(new java.awt.Color(39, 56, 120));
        mnuQuanLy.setText("Quản Lý");

        mniQlytusach.setText("Quản Lý Đầu Sách");
        mniQlytusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQlytusachActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQlytusach);

        mniHoaDon.setText("Quản Lý Hóa Đơn");
        mniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHoaDonActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHoaDon);

        mniKeSach.setText("Quản Lý Kệ Sách");
        mniKeSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKeSachActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKeSach);

        mniKhachHang.setText("Quản Lý Khách Hàng");
        mniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhachHangActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhachHang);

        mniSach.setText("Quản Lý Sách");
        mniSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSachActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniSach);

        mniQlyNhanVien.setText("Quản Lý Nhân viên");
        mniQlyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniQlyNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniQlyNhanVien);

        mnuLichSuKh.setText("Lịch Sử Khách Hàng");
        mnuLichSuKh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLichSuKhActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mnuLichSuKh);

        jMenuBar4.add(mnuQuanLy);

        mnuThongKe.setBackground(new java.awt.Color(39, 56, 120));
        mnuThongKe.setText("Thống Kê");

        mniDoanhTthu.setText("Doanh Thu");
        mniDoanhTthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhTthuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhTthu);

        mniThongkeSach.setText("Doanh Số");
        mniThongkeSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThongkeSachActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniThongkeSach);

        jMenuBar4.add(mnuThongKe);

        mnuXuatNhap.setBackground(new java.awt.Color(39, 56, 120));
        mnuXuatNhap.setText("Xuất-Nhập");

        mniBanHang.setText("Bán Hàng");
        mniBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBanHangActionPerformed(evt);
            }
        });
        mnuXuatNhap.add(mniBanHang);

        mniNhapHang.setText("Nhập Hàng");
        mniNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhapHangActionPerformed(evt);
            }
        });
        mnuXuatNhap.add(mniNhapHang);

        jMenuBar4.add(mnuXuatNhap);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClock)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMatKhauActionPerformed
        this.openDoiMatKhau();
    }//GEN-LAST:event_mniDoiMatKhauActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        opendangnhap();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniQlytusachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQlytusachActionPerformed
        opendausach();
    }//GEN-LAST:event_mniQlytusachActionPerformed

    private void mniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHoaDonActionPerformed
        openBanHang();
    }//GEN-LAST:event_mniHoaDonActionPerformed

    private void mniKeSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKeSachActionPerformed
        openKeSach();
    }//GEN-LAST:event_mniKeSachActionPerformed

    private void mniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhachHangActionPerformed
        openKhachHang();
    }//GEN-LAST:event_mniKhachHangActionPerformed

    private void mniSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSachActionPerformed
        openQLsach();
    }//GEN-LAST:event_mniSachActionPerformed

    private void mniQlyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniQlyNhanVienActionPerformed
        openNhanVien(0);
    }//GEN-LAST:event_mniQlyNhanVienActionPerformed

    private void mnuLichSuKhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLichSuKhActionPerformed
        openLSkh();
    }//GEN-LAST:event_mnuLichSuKhActionPerformed

    private void mniDoanhTthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhTthuActionPerformed
        this.openThongKe(0);
    }//GEN-LAST:event_mniDoanhTthuActionPerformed

    private void mniThongkeSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThongkeSachActionPerformed
        this.openThongKe(1);
    }//GEN-LAST:event_mniThongkeSachActionPerformed

    private void mniBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBanHangActionPerformed
        openBanHang();
    }//GEN-LAST:event_mniBanHangActionPerformed

    private void mniNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhapHangActionPerformed
        openPhieuNhap();
    }//GEN-LAST:event_mniNhapHangActionPerformed

    private void btnBanSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanSachActionPerformed
        // TODO add your handling code here:
        openBanHang();
    }//GEN-LAST:event_btnBanSachActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        openKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSachActionPerformed
        // TODO add your handling code here:
        openQLsach();
    }//GEN-LAST:event_btnSachActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        openThongKe(WIDTH);
    }//GEN-LAST:event_btnThongKeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormChinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChinhJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChinhJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPane;
    private javax.swing.JButton btnBanSach;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhap;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblten;
    private javax.swing.JMenuItem mniBanHang;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDoanhTthu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniHoaDon;
    private javax.swing.JMenuItem mniKeSach;
    private javax.swing.JMenuItem mniKhachHang;
    private javax.swing.JMenuItem mniNhapHang;
    private javax.swing.JMenuItem mniQlyNhanVien;
    private javax.swing.JMenuItem mniQlytusach;
    private javax.swing.JMenuItem mniSach;
    private javax.swing.JMenuItem mniThongkeSach;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenuItem mnuLichSuKh;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuXuatNhap;
    // End of variables declaration//GEN-END:variables

    private void openDoiMatKhau() {
        new DoiMatKhauJDialog(this, true).setVisible(true);
    }

    private void opendangnhap() {
       dispose();
      new  DangNhapJDialog(this, true).setVisible(true);
             
    }

    private void opendausach() {
        DauSachJInternalFrame qlds = new DauSachJInternalFrame();
        DesktopPane.add(qlds);
        qlds.show();
    }

    private void openBanHang() {
        BanSachJInternalFrame qlbs = new BanSachJInternalFrame();
        DesktopPane.add(qlbs);
        qlbs.show();
    }

    private void openKeSach() {
        KeSach1JInternalFrame qlks = new KeSach1JInternalFrame();
        DesktopPane.add(qlks);
        qlks.show();
    }

    private void openKhachHang() {
        KhachHangJInternalFrame qlkh = new KhachHangJInternalFrame();
        DesktopPane.add(qlkh);
        qlkh.show();
    }

    private void openQLsach() {
        SachJInternalFrame qls = new SachJInternalFrame();
        DesktopPane.add(qls);
        qls.show();
    }

    private void openNhanVien(int index) {
        NhanVienJInternalFrame qlnv = new NhanVienJInternalFrame();
        DesktopPane.add(qlnv);
        qlnv.show();
    }

    private void openLSkh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void openThongKe(int i) {
        ThongKeJInternalFrame qltk = new ThongKeJInternalFrame();
        DesktopPane.add(qltk);
        qltk.show();
    }

    private void openPhieuNhap() {
        PhieuNhapJInternalFrame qlpn = new PhieuNhapJInternalFrame();
        DesktopPane.add(qlpn);
        qlpn.show();
    }
}
