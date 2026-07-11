package H;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import x0.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class j extends Paint {
    public j() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public j(int i2) {
        super(i2);
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(o.t(i2, 0, 255));
        } else {
            setColor((o.t(i2, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public j(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public j(int i2, PorterDuff.Mode mode) {
        super(i2);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
