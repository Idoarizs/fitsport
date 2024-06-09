package data;

/**
 *
 * @author Aodi
 */

public class DataPembayaran {

    private String statusPembayaran;
    private String statusKeanggotaan;
    private String tanggalPembayaran;
    private String tenggatPembayaran;

    public DataPembayaran(String statusPembayaran, String statuKeanggotaan, String tanggalPembayaran, String tenggatPembayaran) {
        this.statusPembayaran = statusPembayaran;
        this.statusKeanggotaan = (statusKeanggotaan != null) ? statusKeanggotaan : "-";
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public String getStatusKeanggotaan() {
        return statusKeanggotaan;
    }

    public void setStatusKeanggotaan(String statusKeanggotaan) {
        this.statusKeanggotaan = statusKeanggotaan;
    }

    public String getTenggatPembayaran() {
        return tenggatPembayaran;
    }

    public void setTenggatPembayaran(String tenggatPembayaran) {
        this.tenggatPembayaran = tenggatPembayaran;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }
}
