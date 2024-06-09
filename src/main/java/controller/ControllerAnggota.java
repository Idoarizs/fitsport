package controller;

import configuration.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import data.DataAnggota;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Aodi
 */
public class ControllerAnggota {

    Koneksi koneksi = new Koneksi();

    public List<DataAnggota> getAllData() {
        List<DataAnggota> listAnggota = new ArrayList<>();
        DataAnggota dataAnggota;

        try (Connection conn = koneksi.getConnection()) {
            String query = "SELECT * FROM anggota";

            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenisKelamin = resultSet.getString("jns_kelamin");
                String email = resultSet.getString("email");
                String noHP = resultSet.getString("no_hp");
                String paketLangganan = resultSet.getString("pkt_langganan");
                String coach = resultSet.getString("coach");
                String statusPembayaran = resultSet.getString("sts_pembayaran");
                String statusKeanggotaan = resultSet.getString("sts_keanggotaan");
                String tanggalPembayaran = resultSet.getString("tgl_pembayaran");
                String tenggatPembayaran = resultSet.getString("tgt_pembayaran");

                dataAnggota = new DataAnggota(id_anggota, nama, jenisKelamin, email, noHP, paketLangganan, coach, statusPembayaran, statusKeanggotaan, tanggalPembayaran, tenggatPembayaran);
                listAnggota.add(dataAnggota);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return listAnggota;
    }

    public DataAnggota getDataByID(int id) {
        DataAnggota dataAnggota = null;

        try (Connection conn = koneksi.getConnection()) {
            String query = "SELECT * FROM anggota WHERE id_anggota = ?";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenisKelamin = resultSet.getString("jns_kelamin");
                String email = resultSet.getString("email");
                String noHP = resultSet.getString("no_hp");
                String paketLangganan = resultSet.getString("pkt_langganan");
                String coach = resultSet.getString("coach");
                String statusPembayaran = resultSet.getString("sts_pembayaran");
                String statusKeanggotaan = resultSet.getString("sts_keanggotaan");
                String tanggalPembayaran = resultSet.getString("tgl_pembayaran");
                String tenggatPembayaran = resultSet.getString("tgt_pembayaran");

                dataAnggota = new DataAnggota(id_anggota, nama, jenisKelamin, email, noHP, paketLangganan, coach, statusPembayaran, statusKeanggotaan, tanggalPembayaran, tenggatPembayaran);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return dataAnggota;
    }

    public List<DataAnggota> getDataByName(String cariNama) {
        List<DataAnggota> listAnggota = new ArrayList<>();
        DataAnggota dataAnggota;

        try (Connection conn = koneksi.getConnection()) {
            String query = "SELECT * FROM anggota WHERE nama LIKE ?";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, cariNama + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id_anggota = resultSet.getInt("id_anggota");
                String nama = resultSet.getString("nama");
                String jenisKelamin = resultSet.getString("jns_kelamin");
                String email = resultSet.getString("email");
                String noHP = resultSet.getString("no_hp");
                String paketLangganan = resultSet.getString("pkt_langganan");
                String coach = resultSet.getString("coach");
                String statusPembayaran = resultSet.getString("sts_pembayaran");
                String statusKeanggotaan = resultSet.getString("sts_keanggotaan");
                String tanggalPembayaran = resultSet.getString("tgl_pembayaran");
                String tenggatPembayaran = resultSet.getString("tgt_pembayaran");

                dataAnggota = new DataAnggota(id_anggota, nama, jenisKelamin, email, noHP, paketLangganan, coach, statusPembayaran, statusKeanggotaan, tanggalPembayaran, tenggatPembayaran);
                listAnggota.add(dataAnggota);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return listAnggota;
    }

    public void createData(String nama, String jenisKelamin, String email, String noHP, String paketLangganan, String coach, String statusPembayaran, String statusKeanggotaan, String tanggalPembayaran, String tenggatPembayaran) {
        try (Connection conn = koneksi.getConnection()) {
            String query = "INSERT INTO anggota (nama, jns_kelamin, email, no_hp, pkt_langganan, coach, sts_pembayaran, sts_keanggotaan, tgl_pembayaran, tgt_pembayaran) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            statement.setString(1, nama);
            statement.setString(2, jenisKelamin);
            statement.setString(3, email);
            statement.setString(4, noHP);
            statement.setString(5, paketLangganan);
            statement.setString(6, coach);
            statement.setString(7, statusPembayaran);
            statement.setString(8, statusKeanggotaan);
            statement.setString(9, tanggalPembayaran);
            statement.setString(10, tenggatPembayaran);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil masuk!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memasukkan data!", "Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updateDataByID(int id, String nama, String jenisKelamin, String email, String noHP, String paketLangganan, String coach, String statusPembayaran, String statusKeanggotaan, String tanggalPembayaran, String tenggatPembayaran) {
        try (Connection conn = koneksi.getConnection()) {
            String query = "UPDATE anggota SET nama = ?, jns_kelamin = ?, email = ?, no_hp = ?, pkt_langganan = ?, coach = ?, sts_pembayaran = ?, sts_keanggotaan = ?, tgl_pembayaran = ?, tgt_pembayaran = ? WHERE id_anggota = ?";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, nama);
            statement.setString(2, jenisKelamin);
            statement.setString(3, email);
            statement.setString(4, noHP);
            statement.setString(5, paketLangganan);
            statement.setString(6, coach);
            statement.setString(7, statusPembayaran);
            statement.setString(8, statusKeanggotaan);
            statement.setString(9, tanggalPembayaran);
            statement.setString(10, tenggatPembayaran);
            statement.setInt(11, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil memperbarui data anggota!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memperbarui data anggota!", "Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteDataByID(int id) {
        try (Connection conn = koneksi.getConnection()) {
            String query = "DELETE FROM anggota WHERE id_anggota = ?";

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil menghapus data anggota!", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menghapus data anggota!", "Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
