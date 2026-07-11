package g4f;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Wre {
    private static final Pattern rl = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f67044n = new ArrayList();

    private I28 O(View view) {
        for (I28 i28 : this.f67044n) {
            if (i28.t().get() == view) {
                return i28;
            }
        }
        return null;
    }

    private void nr(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!rl.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    private void rl(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    public void J2() {
        this.f67044n.clear();
    }

    public List n() {
        return this.f67044n;
    }

    public void Uo(View view) {
        rl(view);
        I28 i28O = O(view);
        if (i28O != null) {
            this.f67044n.remove(i28O);
        }
    }

    public void t(View view, a88.fuX fux, String str) {
        rl(view);
        nr(str);
        if (O(view) == null) {
            this.f67044n.add(new I28(view, fux, str));
        }
    }
}
