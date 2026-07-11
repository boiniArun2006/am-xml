package IRN;

import com.caoccao.javet.values.reference.IV8ValueMap;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class CN3 {
    private static final Charset rl = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E8K.CN3 f4199n;

    class j extends JSONObject {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f4200n;

        j(String str) throws JSONException {
            this.f4200n = str;
            put("userId", str);
        }
    }

    public void Ik(String str, Map map) throws Throwable {
        r(str, map, false);
    }

    private static String HI(String str) {
        return new j(str).toString();
    }

    private static List J2(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String string = jSONArray.getString(i2);
            try {
                arrayList.add(aC.n(string));
            } catch (Exception e2) {
                h1M.CN3.J2().qie("Failed de-serializing rollouts state. " + string, e2);
            }
        }
        return arrayList;
    }

    private static String KN(Map map) {
        return new JSONObject(map).toString();
    }

    private static Map O(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, ck(jSONObject, next));
        }
        return map;
    }

    private String Uo(String str) {
        return ck(new JSONObject(str), "userId");
    }

    private static String qie(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                jSONArray.put(new JSONObject(aC.f4212n.rl(list.get(i2))));
            } catch (JSONException e2) {
                h1M.CN3.J2().qie("Exception parsing rollout assignment!", e2);
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public void Z(String str, String str2) throws Throwable {
        String strHI;
        BufferedWriter bufferedWriter;
        File fileNr = nr(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strHI = HI(str2);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileNr), rl));
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(strHI);
            bufferedWriter.flush();
            QNA.Dsr.J2(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            h1M.CN3.J2().qie("Error serializing user metadata.", e);
            QNA.Dsr.J2(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            QNA.Dsr.J2(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public String gh(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileNr = nr(str);
        FileInputStream fileInputStream2 = null;
        if (!fileNr.exists() || fileNr.length() == 0) {
            h1M.CN3.J2().rl("No userId set for session " + str);
            az(fileNr);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileNr);
            try {
                try {
                    String strUo = Uo(QNA.Dsr.te(fileInputStream));
                    h1M.CN3.J2().rl("Loaded userId " + strUo + " for session " + str);
                    QNA.Dsr.J2(fileInputStream, "Failed to close user metadata file.");
                    return strUo;
                } catch (Exception e2) {
                    e = e2;
                    h1M.CN3.J2().qie("Error deserializing user metadata.", e);
                    az(fileNr);
                    QNA.Dsr.J2(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                QNA.Dsr.J2(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            QNA.Dsr.J2(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public List mUb(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileT = t(str);
        if (!fileT.exists() || fileT.length() == 0) {
            ty(fileT, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileT);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List listJ2 = J2(QNA.Dsr.te(fileInputStream));
            h1M.CN3.J2().rl("Loaded rollouts state:\n" + listJ2 + "\nfor session " + str);
            QNA.Dsr.J2(fileInputStream, "Failed to close rollouts state file.");
            return listJ2;
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            h1M.CN3.J2().qie("Error deserializing rollouts state.", e);
            az(fileT);
            QNA.Dsr.J2(fileInputStream2, "Failed to close rollouts state file.");
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            QNA.Dsr.J2(fileInputStream2, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public File n(String str) {
        return this.f4199n.Ik(str, "internal-keys");
    }

    public File nr(String str) {
        return this.f4199n.Ik(str, "user-data");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void o(String str, List list) throws Throwable {
        Throwable th;
        BufferedWriter bufferedWriter;
        Exception e2;
        File fileT = t(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            ty(fileT, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strQie = qie(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileT), rl));
                try {
                    bufferedWriter.write(strQie);
                    bufferedWriter.flush();
                    QNA.Dsr.J2(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e3) {
                    e2 = e3;
                    h1M.CN3.J2().qie("Error serializing rollouts state.", e2);
                    az(fileT);
                    QNA.Dsr.J2(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th2) {
                th = th2;
                QNA.Dsr.J2(IsEmpty, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e4) {
            bufferedWriter = null;
            e2 = e4;
        } catch (Throwable th3) {
            IsEmpty = 0;
            th = th3;
            QNA.Dsr.J2(IsEmpty, "Failed to close rollouts state file.");
            throw th;
        }
    }

    public void r(String str, Map map, boolean z2) throws Throwable {
        String strKN;
        BufferedWriter bufferedWriter;
        File fileN = z2 ? n(str) : rl(str);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strKN = KN(map);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileN), rl));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bufferedWriter.write(strKN);
            bufferedWriter.flush();
            QNA.Dsr.J2(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e3) {
            e = e3;
            bufferedWriter2 = bufferedWriter;
            h1M.CN3.J2().qie("Error serializing key/value metadata.", e);
            az(fileN);
            QNA.Dsr.J2(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            QNA.Dsr.J2(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public File rl(String str) {
        return this.f4199n.Ik(str, IV8ValueMap.FUNCTION_KEYS);
    }

    public File t(String str) {
        return this.f4199n.Ik(str, "rollouts-state");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    Map xMQ(String str, boolean z2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e2;
        File fileN = z2 ? n(str) : rl(str);
        if (!fileN.exists() || fileN.length() == 0) {
            ty(fileN, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileN);
                try {
                    Map mapO = O(QNA.Dsr.te(fileInputStream));
                    QNA.Dsr.J2(fileInputStream, "Failed to close user metadata file.");
                    return mapO;
                } catch (Exception e3) {
                    e2 = e3;
                    h1M.CN3.J2().qie("Error deserializing user metadata.", e2);
                    az(fileN);
                    QNA.Dsr.J2(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th2) {
                th = th2;
                QNA.Dsr.J2(, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e4) {
            fileInputStream = null;
            e2 = e4;
        } catch (Throwable th3) {
            ?? r12 = 0;
            th = th3;
            QNA.Dsr.J2(r12, "Failed to close user metadata file.");
            throw th;
        }
    }

    public CN3(E8K.CN3 cn3) {
        this.f4199n = cn3;
    }

    private static void az(File file) {
        if (file.exists() && file.delete()) {
            h1M.CN3.J2().Uo("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    private static String ck(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    private static void ty(File file, String str) {
        if (file.exists() && file.delete()) {
            h1M.CN3.J2().Uo(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }
}
