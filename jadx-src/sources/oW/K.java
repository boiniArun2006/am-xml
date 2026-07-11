package oW;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzab;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzah;
import com.google.firebase.auth.zzal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class K {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f71457n;
    private Logger nr;
    private String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SharedPreferences f71458t;

    private final void J2(String str, String str2) {
        String strNr = rv6.rl(this.f71457n, this.rl).nr(str2);
        if (strNr != null) {
            this.f71458t.edit().putString(str, "ENCRYPTED:" + strNr).apply();
        }
    }

    private final String gh(FirebaseUser firebaseUser) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        if (!zzaf.class.isAssignableFrom(firebaseUser.getClass())) {
            return null;
        }
        zzaf zzafVar = (zzaf) firebaseUser;
        try {
            jSONObject.put("cachedTokenState", zzafVar.zze());
            jSONObject.put("applicationName", zzafVar.uG().HI());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (zzafVar.Mh() != null) {
                JSONArray jSONArray = new JSONArray();
                List listMh = zzafVar.Mh();
                int size = listMh.size();
                if (listMh.size() > 30) {
                    this.nr.w("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listMh.size()));
                    size = 30;
                }
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    z2 = true;
                    if (i2 >= size) {
                        break;
                    }
                    zzab zzabVar = (zzab) listMh.get(i2);
                    if (zzabVar.n1().equals("firebase")) {
                        z3 = true;
                    }
                    if (i2 == size - 1 && !z3) {
                        break;
                    }
                    jSONArray.put(zzabVar.zzb());
                    i2++;
                }
                if (!z3) {
                    for (int i3 = size - 1; i3 < listMh.size() && i3 >= 0; i3++) {
                        zzab zzabVar2 = (zzab) listMh.get(i3);
                        if (zzabVar2.n1().equals("firebase")) {
                            jSONArray.put(zzabVar2.zzb());
                            break;
                        }
                        if (i3 == listMh.size() - 1) {
                            jSONArray.put(zzabVar2.zzb());
                        }
                    }
                    z2 = z3;
                    if (!z2) {
                        this.nr.w("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listMh.size()), Integer.valueOf(size));
                        if (listMh.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator it = listMh.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", ((zzab) it.next()).n1()));
                            }
                            this.nr.w(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", zzafVar.ub());
            jSONObject.put(NodeModuleProcess.PROPERTY_VERSION, "2");
            if (zzafVar.T3L() != null) {
                jSONObject.put("userMetadata", ((zzah) zzafVar.T3L()).nr());
            }
            List listN = ((fuX) zzafVar.Bu()).n();
            if (listN != null && !listN.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i5 = 0; i5 < listN.size(); i5++) {
                    jSONArray2.put(((MultiFactorInfo) listN.get(i5)).toJson());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List listO9 = zzafVar.o9();
            if (listO9 != null && !listO9.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i7 = 0; i7 < listO9.size(); i7++) {
                    jSONArray3.put(zzal.p0N((zzal) listO9.get(i7)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            this.nr.wtf("Failed to turn object into JSON", e2, new Object[0]);
            throw new zzaag(e2);
        }
    }

    private final String nr(String str) {
        String string = this.f71458t.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? rv6.rl(this.f71457n, this.rl).n(string.substring(10)) : string;
        }
        return null;
    }

    private final zzaf t(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        zzah zzahVarT;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z2 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString(NodeModuleProcess.PROPERTY_VERSION);
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(zzab.Bu(jSONArray3.getString(i2)));
            }
            zzaf zzafVar = new zzaf(com.google.firebase.Wre.ty(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzafVar.y(zzahn.zzb(string));
            }
            if (!z2) {
                zzafVar.Zn();
            }
            zzafVar.n7b(str);
            if (jSONObject.has("userMetadata") && (zzahVarT = zzah.t(jSONObject.getJSONObject("userMetadata"))) != null) {
                zzafVar.Aum(zzahVarT);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i3));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? PhoneMultiFactorInfo.Uf(jSONObject2) : Objects.equals(strOptString, "totp") ? TotpMultiFactorInfo.Uf(jSONObject2) : null);
                }
                zzafVar.v0j(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                    arrayList3.add(zzal.Bu(new JSONObject(jSONArray.getString(i5))));
                }
                zzafVar.nO(arrayList3);
            }
            return zzafVar;
        } catch (zzaag e2) {
            e = e2;
            this.nr.wtf(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
            this.nr.wtf(e);
            return null;
        } catch (IllegalArgumentException e4) {
            e = e4;
            this.nr.wtf(e);
            return null;
        } catch (JSONException e5) {
            e = e5;
            this.nr.wtf(e);
            return null;
        }
    }

    private final void xMQ(String str) {
        this.f71458t.edit().remove(str).apply();
    }

    public final void Uo() {
        xMQ("com.google.firebase.auth.FIREBASE_USER");
    }

    public final FirebaseUser rl() {
        String strNr = nr("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(strNr)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strNr);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return t(jSONObject);
            }
        } catch (Exception unused) {
            this.nr.i("Failed to restore user data from persistent storage.", new Object[0]);
        }
        return null;
    }

    public K(Context context, String str) {
        Preconditions.checkNotNull(context);
        this.rl = Preconditions.checkNotEmpty(str);
        this.f71457n = context.getApplicationContext();
        this.f71458t = this.f71457n.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.rl), 0);
        this.nr = new Logger("StorageHelpers", new String[0]);
    }

    public final void KN(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        xMQ(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.f()));
    }

    public final void O(FirebaseUser firebaseUser, zzahn zzahnVar) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzahnVar);
        J2(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.f()), zzahnVar.zzf());
    }

    public final void mUb(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String strGh = gh(firebaseUser);
        if (!TextUtils.isEmpty(strGh)) {
            J2("com.google.firebase.auth.FIREBASE_USER", strGh);
        }
    }

    public final zzahn n(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        String strNr = nr(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.f()));
        if (strNr != null) {
            try {
                return zzahn.zzb(strNr);
            } catch (zzaag unused) {
                this.nr.i("Failed to restore token data from persistent storage.", new Object[0]);
                return null;
            }
        }
        return null;
    }
}
