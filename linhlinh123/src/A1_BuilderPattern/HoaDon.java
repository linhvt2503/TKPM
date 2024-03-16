package A1_BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds;

    public HoaDon(HoaDonHeader hoaDonHeader, List<CTHD> cthds) {
        this.hoaDonHeader = hoaDonHeader;
        this.cthds = cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader.toString());
        builder.append("Chi tiết hóa đơn:");
        for (CTHD c: cthds)
            builder.append("\n")
                    .append(c.toString());
        return builder.toString();
    }
    public static class Builder {
        private HoaDonHeader hoaDonHeader;
        private List<CTHD> list;

        public Builder() {
            this.list = new ArrayList<>();
        }

        public Builder setHoadonhedar(HoaDonHeader hoaDonHeader) {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder addCTHD(CTHD cthd) {
            list.add(cthd);
            return this;
        }

        public HoaDon build() {
            return new HoaDon(hoaDonHeader, list);
        }
    }
}
