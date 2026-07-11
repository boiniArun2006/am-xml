package DMw;

import android.util.Base64;
import android.util.JsonReader;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final WkR.j f1416n = new nS.Ml().mUb(tq6.j.f73755n).gh(true).xMQ();

    /* JADX INFO: Access modifiers changed from: private */
    interface j {
        Object n(JsonReader jsonReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml.j.n.AbstractC1204j Z(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.AbstractC1204j.AbstractC1205j abstractC1205jN = DAz.I28.Ml.j.n.AbstractC1204j.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    abstractC1205jN.t(jsonReader.nextString());
                    break;
                case "size":
                    abstractC1205jN.nr(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC1205jN.J2(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC1205jN.rl(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1205jN.n();
    }

    private static DAz.I28 nHg(JsonReader jsonReader) throws IOException {
        DAz.I28.n nVarN = DAz.I28.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "startedAt":
                    nVarN.az(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    nVarN.t(jsonReader.nextString());
                    break;
                case "identifier":
                    nVarN.gh(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    nVarN.J2(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    nVarN.O(Ik(jsonReader));
                    break;
                case "events":
                    nVarN.Uo(ty(jsonReader, new j() { // from class: DMw.Ml
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    nVarN.qie(e(jsonReader));
                    break;
                case "app":
                    nVarN.rl(qie(jsonReader));
                    break;
                case "user":
                    nVarN.ty(s7N(jsonReader));
                    break;
                case "generator":
                    nVarN.KN(jsonReader.nextString());
                    break;
                case "crashed":
                    nVarN.nr(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    nVarN.xMQ(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nVarN.n();
    }

    private static List ty(JsonReader jsonReader, j jVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jVar.n(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public String gh(DAz.I28.Ml ml) {
        return f1416n.rl(ml);
    }

    public DAz.I28.Ml mUb(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                DAz.I28.Ml mlR = r(jsonReader);
                jsonReader.close();
                return mlR;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    public String v(DAz dAz) {
        return f1416n.rl(dAz);
    }

    public DAz wTp(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                DAz dAzT = T(jsonReader);
                jsonReader.close();
                return dAzT;
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    private static DAz.Ml E2(JsonReader jsonReader) throws IOException {
        DAz.Ml.j jVarN = DAz.Ml.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(FileUploadManager.f61571i)) {
                if (!strNextName.equals("orgId")) {
                    jsonReader.skipValue();
                } else {
                    jVarN.t(jsonReader.nextString());
                }
            } else {
                jVarN.rl(ty(jsonReader, new j() { // from class: DMw.I28
                    @Override // DMw.aC.j
                    public final Object n(JsonReader jsonReader2) {
                        return aC.fD(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.j.AbstractC1210j HI(JsonReader jsonReader) throws IOException {
        DAz.j.AbstractC1210j.AbstractC1211j abstractC1211jN = DAz.j.AbstractC1210j.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "libraryName":
                    abstractC1211jN.nr(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC1211jN.rl(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC1211jN.t(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1211jN.n();
    }

    private static DAz.I28.w6 Ik(JsonReader jsonReader) throws IOException {
        DAz.I28.w6.j jVarN = DAz.I28.w6.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "simulator":
                    jVarN.xMQ(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    jVarN.O(jsonReader.nextString());
                    break;
                case "ram":
                    jVarN.KN(jsonReader.nextLong());
                    break;
                case "arch":
                    jVarN.rl(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    jVarN.nr(jsonReader.nextLong());
                    break;
                case "cores":
                    jVarN.t(jsonReader.nextInt());
                    break;
                case "model":
                    jVarN.J2(jsonReader.nextString());
                    break;
                case "state":
                    jVarN.mUb(jsonReader.nextInt());
                    break;
                case "modelClass":
                    jVarN.Uo(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.AbstractC1195I28.n N(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.AbstractC1195I28.n.j jVarN = DAz.I28.Ml.AbstractC1195I28.n.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("variantId")) {
                if (!strNextName.equals("rolloutId")) {
                    jsonReader.skipValue();
                } else {
                    jVarN.rl(jsonReader.nextString());
                }
            } else {
                jVarN.t(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.j.n S(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.AbstractC1206n abstractC1206nN = DAz.I28.Ml.j.n.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC1206nN.rl(az(jsonReader));
                    break;
                case "threads":
                    abstractC1206nN.J2(ty(jsonReader, new j() { // from class: DMw.CN3
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.iF(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC1206nN.O(te(jsonReader));
                    break;
                case "binaries":
                    abstractC1206nN.t(ty(jsonReader, new j() { // from class: DMw.fuX
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.Z(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC1206nN.nr(WPU(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1206nN.n();
    }

    private static DAz T(JsonReader jsonReader) throws IOException {
        DAz.n nVarRl = DAz.rl();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    nVarRl.mUb(E2(jsonReader));
                    break;
                case "sdkVersion":
                    nVarRl.qie(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    nVarRl.t(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    nVarRl.rl(az(jsonReader));
                    break;
                case "buildVersion":
                    nVarRl.nr(jsonReader.nextString());
                    break;
                case "firebaseAuthenticationToken":
                    nVarRl.J2(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    nVarRl.KN(jsonReader.nextString());
                    break;
                case "installationUuid":
                    nVarRl.xMQ(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    nVarRl.Uo(jsonReader.nextString());
                    break;
                case "platform":
                    nVarRl.gh(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    nVarRl.O(jsonReader.nextString());
                    break;
                case "session":
                    nVarRl.az(nHg(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nVarRl.n();
    }

    private static DAz.I28.Ml.AbstractC1196Ml ViF(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.AbstractC1196Ml.j jVarN = DAz.I28.Ml.AbstractC1196Ml.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                jVarN.rl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.j.n.w6 WPU(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.w6.AbstractC1207j abstractC1207jN = DAz.I28.Ml.j.n.w6.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1207jN.t(ty(jsonReader, new Dsr()));
                    break;
                case "reason":
                    abstractC1207jN.O(jsonReader.nextString());
                    break;
                case "type":
                    abstractC1207jN.J2(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC1207jN.rl(WPU(jsonReader));
                    break;
                case "overflowCount":
                    abstractC1207jN.nr(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1207jN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml.j.w6 X(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.w6.AbstractC1208j abstractC1208jN = DAz.I28.Ml.j.w6.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    abstractC1208jN.nr(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC1208jN.O(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC1208jN.rl(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC1208jN.t(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1208jN.n();
    }

    private static DAz.I28.Ml.w6 XQ(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.w6.j jVarN = DAz.I28.Ml.w6.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "batteryLevel":
                    jVarN.rl(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    jVarN.t(jsonReader.nextInt());
                    break;
                case "orientation":
                    jVarN.O(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    jVarN.nr(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    jVarN.Uo(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    jVarN.J2(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n aYN(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.AbstractC1201j abstractC1201jN = DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1200n.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    abstractC1201jN.nr(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC1201jN.J2(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC1201jN.O(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC1201jN.rl(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1201jN.t(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1201jN.n();
    }

    private static DAz.j az(JsonReader jsonReader) throws IOException {
        DAz.j.n nVarN = DAz.j.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    nVarN.rl(ty(jsonReader, new j() { // from class: DMw.j
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.HI(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    nVarN.nr(jsonReader.nextInt());
                    break;
                case "pss":
                    nVarN.J2(jsonReader.nextLong());
                    break;
                case "rss":
                    nVarN.KN(jsonReader.nextLong());
                    break;
                case "timestamp":
                    nVarN.xMQ(jsonReader.nextLong());
                    break;
                case "processName":
                    nVarN.O(jsonReader.nextString());
                    break;
                case "reasonCode":
                    nVarN.Uo(jsonReader.nextInt());
                    break;
                case "traceFile":
                    nVarN.mUb(jsonReader.nextString());
                    break;
                case "importance":
                    nVarN.t(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nVarN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.w6 ck(JsonReader jsonReader) throws IOException {
        DAz.w6.j jVarN = DAz.w6.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("key")) {
                if (!strNextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    jVarN.t(jsonReader.nextString());
                }
            } else {
                jVarN.rl(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.AbstractC1194I28 e(JsonReader jsonReader) throws IOException {
        DAz.I28.AbstractC1194I28.j jVarN = DAz.I28.AbstractC1194I28.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildVersion":
                    jVarN.rl(jsonReader.nextString());
                    break;
                case "jailbroken":
                    jVarN.t(jsonReader.nextBoolean());
                    break;
                case "version":
                    jVarN.O(jsonReader.nextString());
                    break;
                case "platform":
                    jVarN.nr(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.Ml.n fD(JsonReader jsonReader) throws IOException {
        DAz.Ml.n.j jVarN = DAz.Ml.n.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("filename")) {
                if (!strNextName.equals("contents")) {
                    jsonReader.skipValue();
                } else {
                    jVarN.rl(Base64.decode(jsonReader.nextString(), 2));
                }
            } else {
                jVarN.t(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.Wre g(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.Wre.j jVarN = DAz.I28.Ml.Wre.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("assignments")) {
                jsonReader.skipValue();
            } else {
                jVarN.rl(ty(jsonReader, new j() { // from class: DMw.Wre
                    @Override // DMw.aC.j
                    public final Object n(JsonReader jsonReader2) {
                        return aC.nY(jsonReader2);
                    }
                }));
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml.j.n.AbstractC1198I28 iF(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.AbstractC1198I28.AbstractC1199j abstractC1199jN = DAz.I28.Ml.j.n.AbstractC1198I28.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    abstractC1199jN.rl(ty(jsonReader, new Dsr()));
                    break;
                case "name":
                    abstractC1199jN.nr(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC1199jN.t(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1199jN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml.AbstractC1195I28 nY(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.AbstractC1195I28.j jVarN = DAz.I28.Ml.AbstractC1195I28.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parameterKey":
                    jVarN.rl(jsonReader.nextString());
                    break;
                case "templateVersion":
                    jVarN.O(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    jVarN.nr(N(jsonReader));
                    break;
                case "parameterValue":
                    jVarN.t(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.j o(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.AbstractC1197j abstractC1197jN = DAz.I28.Ml.j.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC1197jN.rl(ty(jsonReader, new j() { // from class: DMw.w6
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.X(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC1197jN.t(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC1197jN.J2(S(jsonReader));
                    break;
                case "internalKeys":
                    abstractC1197jN.Uo(ty(jsonReader, new j() { // from class: DMw.n
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.ck(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC1197jN.O(ty(jsonReader, new j() { // from class: DMw.n
                        @Override // DMw.aC.j
                        public final Object n(JsonReader jsonReader2) {
                            return aC.ck(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC1197jN.KN(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC1197jN.nr(X(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1197jN.n();
    }

    private static DAz.I28.j qie(JsonReader jsonReader) throws IOException {
        DAz.I28.j.AbstractC1209j abstractC1209jN = DAz.I28.j.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "identifier":
                    abstractC1209jN.O(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC1209jN.rl(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC1209jN.t(jsonReader.nextString());
                    break;
                case "version":
                    abstractC1209jN.Uo(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC1209jN.J2(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC1209jN.nr(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1209jN.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DAz.I28.Ml r(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.n nVarN = DAz.I28.Ml.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    nVarN.t(XQ(jsonReader));
                    break;
                case "rollouts":
                    nVarN.O(g(jsonReader));
                    break;
                case "app":
                    nVarN.rl(o(jsonReader));
                    break;
                case "log":
                    nVarN.nr(ViF(jsonReader));
                    break;
                case "type":
                    nVarN.Uo(jsonReader.nextString());
                    break;
                case "timestamp":
                    nVarN.J2(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return nVarN.n();
    }

    private static DAz.I28.Wre s7N(JsonReader jsonReader) throws IOException {
        DAz.I28.Wre.j jVarN = DAz.I28.Wre.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                jVarN.rl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return jVarN.n();
    }

    private static DAz.I28.Ml.j.n.AbstractC1202Ml te(JsonReader jsonReader) throws IOException {
        DAz.I28.Ml.j.n.AbstractC1202Ml.AbstractC1203j abstractC1203jN = DAz.I28.Ml.j.n.AbstractC1202Ml.n();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "address":
                    abstractC1203jN.rl(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC1203jN.t(jsonReader.nextString());
                    break;
                case "name":
                    abstractC1203jN.nr(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC1203jN.n();
    }
}
