package R9s;

import Msr.Ml;
import Msr.n;
import Qt.w6;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SharedPreferences f8685n;
    public final w6 rl = new w6();

    public final String n() {
        String string = this.f8685n.getString("odt", null);
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            String string2 = jSONArray.getString(0);
            return this.rl.rl(jSONArray.getString(1), Base64.decode(string2, 0));
        } catch (IOException e2) {
            e = e2;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (InvalidKeyException e4) {
            e = e4;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (NoSuchPaddingException e6) {
            e = e6;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (JSONException e7) {
            e = e7;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        } catch (Exception e8) {
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e8, Msr.w6.FAILED_EXTRACT_ENCRYPTED_DATA));
            return "";
        }
    }

    public final void rl(String str) {
        try {
            Pair pairN = this.rl.n(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(pairN.first).put(pairN.second);
            this.f8685n.edit().putString("odt", jSONArray.toString()).apply();
        } catch (IOException e2) {
            e = e2;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidAlgorithmParameterException e3) {
            e = e3;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        } catch (InvalidKeyException e4) {
            e = e4;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        } catch (NoSuchPaddingException e6) {
            e = e6;
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        } catch (Exception e7) {
            n.rl(Ml.ENCRYPTION_EXCEPTION, Ci2.j.n(e7, Msr.w6.FAILED_STORE_ENCRYPTED_DATA));
        }
    }

    public j(Context context) {
        this.f8685n = context.getSharedPreferences("odt_storage", 0);
    }
}
