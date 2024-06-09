package data;

/**
 *
 * @author Aodi
 */
public class DataAnggota {

    private int id;
    private String nama;
    private String jenisKelamin;
    private String email;
    private String noHP;
    private String paketLangganan;
    private String coach;
    private String statusPembayaran;
    private String statusKeanggotaan;
    private String tanggalPembayaran;
    private String tenggatPembayaran;

    public DataAnggota(int id, String nama, String jenisKelamin, String email, String noHP, String paketLangganan, String coach, String statusPembayaran, String statusKeanggotaan, String tanggalPembayaran, String tenggatPembayaran) {
        this.id = id;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.email = email;
        this.noHP = noHP;
        this.paketLangganan = paketLangganan;
        this.coach = coach;
        this.statusPembayaran = statusPembayaran;
        this.statusKeanggotaan = statusKeanggotaan;
        this.tanggalPembayaran = tanggalPembayaran;
        this.tenggatPembayaran = tenggatPembayaran;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public String getEmail() {
        return email;
    }

    public String getNoHP() {
        return noHP;
    }

    public String getPaketLangganan() {
        return paketLangganan;
    }

    public String getCoach() {
        return coach;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public String getStatusKeanggotaan() {
        return statusKeanggotaan;
    }

    public String getTenggatPembayaran() {
        return tenggatPembayaran;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }
}
