package com.facebook;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.MimeTypes;
import c8G.Fsz.qwlyMfUJj;
import com.caoccao.javet.values.primitive.V8ValueNull;
import com.facebook.GraphRequest;
import com.facebook.ci;
import com.facebook.internal.Lu;
import com.facebook.internal.Z;
import com.facebook.internal.vd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.l;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zC.dj.dpcnwfoVOnrtRA;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class GraphRequest {
    public static String Ik;
    public static final String ck;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile String f52184o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Pattern f52185r;
    public boolean J2;
    public Object KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f52186O;
    public Bundle Uo;
    public String az;
    public afx gh;
    public n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AccessToken f52187n;
    public String nr;
    public boolean qie;
    public String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public JSONObject f52188t;
    public String xMQ;
    public static final w6 ty = new w6(null);
    public static final String HI = GraphRequest.class.getSimpleName();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public static final class CN3 implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ArrayList f52189n;

        public CN3(ArrayList arrayList) {
            this.f52189n = arrayList;
        }

        @Override // com.facebook.GraphRequest.I28
        public void n(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f52189n;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{key, URLEncoder.encode(value, com.google.android.exoplayer2.C.UTF8_NAME)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            arrayList.add(str);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private interface I28 {
        void n(String str, String str2);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface Ml {
        void onCompleted(JSONObject jSONObject, g9s g9sVar);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001a*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "Landroid/os/Parcelable;", "RESOURCE", "resource", "", "mimeType", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "Ljava/lang/String;", "()Ljava/lang/String;", "t", "Landroid/os/Parcelable;", "rl", "()Landroid/os/Parcelable;", "O", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends Parcelable> implements Parcelable {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public final String mimeType;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        public final Parcelable resource;

        @JvmField
        public static final Parcelable.Creator<ParcelableResourceWithMimeType<?>> CREATOR = new j();

        public static final class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType createFromParcel(Parcel source) {
                Intrinsics.checkNotNullParameter(source, "source");
                return new ParcelableResourceWithMimeType(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public ParcelableResourceWithMimeType[] newArray(int i2) {
                return new ParcelableResourceWithMimeType[i2];
            }
        }

        public /* synthetic */ ParcelableResourceWithMimeType(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public ParcelableResourceWithMimeType(Parcelable parcelable, String str) {
            this.mimeType = str;
            this.resource = parcelable;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final Parcelable getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(Parcel parcel) {
            this.mimeType = parcel.readString();
            this.resource = parcel.readParcelable(s4.qie().getClassLoader());
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    private static final class Wre implements I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final OutputStream f52193n;
        public final boolean nr;
        public final com.facebook.internal.Z rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f52194t;

        public Wre(OutputStream outputStream, com.facebook.internal.Z z2, boolean z3) {
            Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.f52193n = outputStream;
            this.rl = z2;
            this.f52194t = true;
            this.nr = z3;
        }

        private final RuntimeException rl() {
            return new IllegalArgumentException("value is not a supported type.");
        }

        public final void J2(String str, String str2, String str3) throws IOException {
            if (this.nr) {
                OutputStream outputStream = this.f52193n;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str4 = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
                byte[] bytes = str4.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            t("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                t("; filename=\"%s\"", str2);
            }
            xMQ("", new Object[0]);
            if (str3 != null) {
                xMQ("%s: %s", "Content-Type", str3);
            }
            xMQ("", new Object[0]);
        }

        public final void KN(String key, ParcelFileDescriptor descriptor, String str) throws IOException {
            int iIk;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (str == null) {
                str = "content/unknown";
            }
            J2(key, key, str);
            OutputStream outputStream = this.f52193n;
            if (outputStream instanceof u) {
                ((u) outputStream).rl(descriptor.getStatSize());
                iIk = 0;
            } else {
                iIk = vd.Ik(new ParcelFileDescriptor.AutoCloseInputStream(descriptor), this.f52193n);
            }
            xMQ("", new Object[0]);
            gh();
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iIk)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                z2.nr("    " + key, str2);
            }
        }

        public final void O(String key, byte[] bytes) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            J2(key, key, "content/unknown");
            this.f52193n.write(bytes);
            xMQ("", new Object[0]);
            gh();
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bytes.length)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                z2.nr("    " + key, str);
            }
        }

        public final void Uo(String key, Uri contentUri, String str) throws IOException {
            int iIk;
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (str == null) {
                str = "content/unknown";
            }
            J2(key, key, str);
            if (this.f52193n instanceof u) {
                ((u) this.f52193n).rl(vd.g(contentUri));
                iIk = 0;
            } else {
                iIk = vd.Ik(s4.qie().getContentResolver().openInputStream(contentUri), this.f52193n);
            }
            xMQ("", new Object[0]);
            gh();
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iIk)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                z2.nr("    " + key, str2);
            }
        }

        public final void gh() throws IOException {
            if (!this.nr) {
                xMQ("--%s", GraphRequest.ck);
                return;
            }
            OutputStream outputStream = this.f52193n;
            byte[] bytes = "&".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void mUb(String key, Object obj, GraphRequest graphRequest) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Closeable closeable = this.f52193n;
            if (closeable instanceof Ln) {
                Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
                ((Ln) closeable).n(graphRequest);
            }
            w6 w6Var = GraphRequest.ty;
            if (w6Var.WPU(obj)) {
                n(key, w6Var.iF(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                nr(key, (Bitmap) obj);
                return;
            }
            if (obj instanceof byte[]) {
                O(key, (byte[]) obj);
                return;
            }
            if (obj instanceof Uri) {
                Uo(key, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                KN(key, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof ParcelableResourceWithMimeType)) {
                throw rl();
            }
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = (ParcelableResourceWithMimeType) obj;
            Parcelable resource = parcelableResourceWithMimeType.getResource();
            String mimeType = parcelableResourceWithMimeType.getMimeType();
            if (resource instanceof ParcelFileDescriptor) {
                KN(key, (ParcelFileDescriptor) resource, mimeType);
            } else {
                if (!(resource instanceof Uri)) {
                    throw rl();
                }
                Uo(key, (Uri) resource, mimeType);
            }
        }

        @Override // com.facebook.GraphRequest.I28
        public void n(String key, String value) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            J2(key, null, null);
            xMQ("%s", value);
            gh();
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                z2.nr("    " + key, value);
            }
        }

        public final void nr(String key, Bitmap bitmap) throws IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            J2(key, key, MimeTypes.IMAGE_PNG);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, this.f52193n);
            xMQ("", new Object[0]);
            gh();
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                z2.nr("    " + key, "<Image>");
            }
        }

        public final void qie(String key, JSONArray requestJsonArray, Collection requests) throws JSONException, IOException {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            Intrinsics.checkNotNullParameter(requests, "requests");
            Closeable closeable = this.f52193n;
            if (!(closeable instanceof Ln)) {
                String string = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string, "requestJsonArray.toString()");
                n(key, string);
                return;
            }
            Intrinsics.checkNotNull(closeable, "null cannot be cast to non-null type com.facebook.RequestOutputStream");
            Ln ln2 = (Ln) closeable;
            J2(key, null, null);
            t("[", new Object[0]);
            Iterator it = requests.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                GraphRequest graphRequest = (GraphRequest) it.next();
                JSONObject jSONObject = requestJsonArray.getJSONObject(i2);
                ln2.n(graphRequest);
                if (i2 > 0) {
                    t(",%s", jSONObject.toString());
                } else {
                    t("%s", jSONObject.toString());
                }
                i2 = i3;
            }
            t("]", new Object[0]);
            com.facebook.internal.Z z2 = this.rl;
            if (z2 != null) {
                String string2 = requestJsonArray.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "requestJsonArray.toString()");
                z2.nr("    " + key, string2);
            }
        }

        public final void t(String format, Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (this.nr) {
                OutputStream outputStream = this.f52193n;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = Locale.US;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
                String strEncode = URLEncoder.encode(str, com.google.android.exoplayer2.C.UTF8_NAME);
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(String.format(Loc… format, *args), \"UTF-8\")");
                byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                outputStream.write(bytes);
                return;
            }
            if (this.f52194t) {
                OutputStream outputStream2 = this.f52193n;
                Charset charset = Charsets.UTF_8;
                byte[] bytes2 = "--".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                outputStream2.write(bytes2);
                OutputStream outputStream3 = this.f52193n;
                byte[] bytes3 = GraphRequest.ck.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                outputStream3.write(bytes3);
                OutputStream outputStream4 = this.f52193n;
                byte[] bytes4 = "\r\n".getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes4, "this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                this.f52194t = false;
            }
            OutputStream outputStream5 = this.f52193n;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf2 = Arrays.copyOf(args, args.length);
            String str2 = String.format(format, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            byte[] bytes5 = str2.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes5, "this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void xMQ(String format, Object... args) throws IOException {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            t(format, Arrays.copyOf(args, args.length));
            if (this.nr) {
                return;
            }
            t("\r\n", new Object[0]);
        }
    }

    private static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final GraphRequest f52195n;
        public final Object rl;

        public j(GraphRequest request, Object obj) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f52195n = request;
            this.rl = obj;
        }

        public final GraphRequest n() {
            return this.f52195n;
        }

        public final Object rl() {
            return this.rl;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public interface n {
        void n(g9s g9sVar);
    }

    public static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public w6() {
        }

        private final String Ik() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{GraphRequest.ck}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean S(Object obj) {
            return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof ParcelableResourceWithMimeType);
        }

        public static final void T(ArrayList callbacks, ci requests) {
            Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            Intrinsics.checkNotNullParameter(requests, "$requests");
            Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                n nVar = (n) pair.first;
                Object obj = pair.second;
                Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                nVar.n((g9s) obj);
            }
            Iterator it2 = requests.az().iterator();
            while (it2.hasNext()) {
                ((ci.j) it2.next()).n(requests);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean WPU(Object obj) {
            return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
        }

        private final void e(ci ciVar, com.facebook.internal.Z z2, int i2, URL url, OutputStream outputStream, boolean z3) throws JSONException, IOException {
            Wre wre = new Wre(outputStream, z2, z3);
            if (i2 != 1) {
                String strCk = ck(ciVar);
                if (strCk.length() == 0) {
                    throw new FacebookException("App ID was not specified at the request or Settings.");
                }
                wre.n("batch_app_id", strCk);
                HashMap map = new HashMap();
                s7N(wre, ciVar, map);
                if (z2 != null) {
                    z2.rl("  Attachments:\n");
                }
                N(map, wre);
                return;
            }
            GraphRequest graphRequestMUb = ciVar.get(0);
            HashMap map2 = new HashMap();
            for (String key : graphRequestMUb.XQ().keySet()) {
                Object obj = graphRequestMUb.XQ().get(key);
                if (S(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    map2.put(key, new j(graphRequestMUb, obj));
                }
            }
            if (z2 != null) {
                z2.rl("  Parameters:\n");
            }
            nHg(graphRequestMUb.XQ(), wre, graphRequestMUb);
            if (z2 != null) {
                z2.rl("  Attachments:\n");
            }
            N(map2, wre);
            JSONObject jSONObjectIk = graphRequestMUb.Ik();
            if (jSONObjectIk != null) {
                String path = url.getPath();
                Intrinsics.checkNotNullExpressionValue(path, "url.path");
                fD(jSONObjectIk, path, wre);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String iF(Object obj) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if ((obj instanceof Boolean) || (obj instanceof Number)) {
                return obj.toString();
            }
            if (!(obj instanceof Date)) {
                throw new IllegalArgumentException("Unsupported parameter type.");
            }
            String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            Intrinsics.checkNotNullExpressionValue(str, "iso8601DateFormat.format(value)");
            return str;
        }

        public static final void nY(Ml ml, g9s response) {
            Intrinsics.checkNotNullParameter(response, "response");
            if (ml != null) {
                ml.onCompleted(response.t(), response);
            }
        }

        private final void s7N(Wre wre, Collection collection, Map map) throws JSONException, IOException {
            JSONArray jSONArray = new JSONArray();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).iF(jSONArray, map);
            }
            wre.qie("batch", jSONArray, collection);
        }

        private final void v(HttpURLConnection httpURLConnection, boolean z2) {
            if (!z2) {
                httpURLConnection.setRequestProperty("Content-Type", Ik());
            } else {
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            }
        }

        public final List HI(HttpURLConnection connection, ci requests) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(requests, "requests");
            List listJ2 = g9s.xMQ.J2(connection, requests);
            vd.r(connection);
            int size = requests.size();
            if (size == listJ2.size()) {
                X(requests, listJ2);
                com.facebook.Wre.J2.O().KN();
                return listJ2;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(listJ2.size()), Integer.valueOf(size)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            throw new FacebookException(str);
        }

        public final g9s KN(GraphRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            List listGh = gh(request);
            if (listGh.size() == 1) {
                return (g9s) listGh.get(0);
            }
            throw new FacebookException("invalid state: expected a single response");
        }

        public final GraphRequest ViF(AccessToken accessToken, final Ml ml) {
            return new GraphRequest(accessToken, "me", null, null, new n() { // from class: com.facebook.Q
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    GraphRequest.w6.nY(ml, g9sVar);
                }
            }, null, 32, null);
        }

        public final void X(final ci requests, List responses) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                GraphRequest graphRequestMUb = requests.get(i2);
                if (graphRequestMUb.HI() != null) {
                    arrayList.add(new Pair(graphRequestMUb.HI(), responses.get(i2)));
                }
            }
            if (arrayList.size() > 0) {
                Runnable runnable = new Runnable() { // from class: com.facebook.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        GraphRequest.w6.T(arrayList, requests);
                    }
                };
                Handler handlerQie = requests.qie();
                if (handlerQie != null) {
                    handlerQie.post(runnable);
                } else {
                    runnable.run();
                }
            }
        }

        public final GraphRequest aYN(AccessToken accessToken, String str, n nVar) {
            return new GraphRequest(accessToken, str, null, null, nVar, null, 32, null);
        }

        public final SPz az(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return qie(new ci(requests));
        }

        public final void bzg(ci requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            Iterator<E> it = requests.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                if (afx.GET == graphRequest.Z() && vd.I(graphRequest.XQ().getString("fields"))) {
                    Z.j jVar = com.facebook.internal.Z.f52780O;
                    Ew ew = Ew.DEVELOPER_ERRORS;
                    StringBuilder sb = new StringBuilder();
                    sb.append("GET requests for /");
                    String strR = graphRequest.r();
                    if (strR == null) {
                        strR = "";
                    }
                    sb.append(strR);
                    sb.append(" should contain an explicit \"fields\" parameter.");
                    jVar.n(ew, 5, "Request", sb.toString());
                }
            }
        }

        public final GraphRequest g(AccessToken accessToken, String str, JSONObject jSONObject, n nVar) {
            GraphRequest graphRequest = new GraphRequest(accessToken, str, null, afx.POST, nVar, null, 32, null);
            graphRequest.e(jSONObject);
            return graphRequest;
        }

        public final List gh(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return mUb(ArraysKt.toList(requests));
        }

        public final List mUb(Collection requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return xMQ(new ci(requests));
        }

        public final SPz qie(ci ciVar) {
            String str = dpcnwfoVOnrtRA.JBJBoevhSKZXHf;
            Intrinsics.checkNotNullParameter(ciVar, str);
            Lu.xMQ(ciVar, str);
            SPz sPz = new SPz(ciVar);
            sPz.executeOnExecutor(s4.Z(), new Void[0]);
            return sPz;
        }

        public final HttpURLConnection rV9(ci requests) throws Throwable {
            Intrinsics.checkNotNullParameter(requests, "requests");
            bzg(requests);
            try {
                HttpURLConnection httpURLConnectionUo = null;
                try {
                    httpURLConnectionUo = Uo(requests.size() == 1 ? new URL(requests.get(0).aYN()) : new URL(com.facebook.internal.qf.KN()));
                    wTp(requests, httpURLConnectionUo);
                    return httpURLConnectionUo;
                } catch (IOException e2) {
                    vd.r(httpURLConnectionUo);
                    throw new FacebookException("could not construct request body", e2);
                } catch (JSONException e3) {
                    vd.r(httpURLConnectionUo);
                    throw new FacebookException("could not construct request body", e3);
                }
            } catch (MalformedURLException e4) {
                throw new FacebookException("could not construct URL for request", e4);
            }
        }

        public final GraphRequest te(AccessToken accessToken, String str, Bundle bundle, n nVar) {
            return new GraphRequest(accessToken, str, bundle, afx.POST, nVar, null, 32, null);
        }

        public final SPz ty(GraphRequest... requests) {
            Intrinsics.checkNotNullParameter(requests, "requests");
            return az(ArraysKt.toList(requests));
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void wTp(ci requests, HttpURLConnection connection) throws Throwable {
            Throwable th;
            URL url;
            OutputStream qfVar;
            ci ciVar;
            w6 w6Var;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Intrinsics.checkNotNullParameter(connection, "connection");
            com.facebook.internal.Z z2 = new com.facebook.internal.Z(Ew.REQUESTS, "Request");
            int size = requests.size();
            boolean Z2 = Z(requests);
            OutputStream outputStream = null;
            afx afxVarZ = size == 1 ? requests.get(0).Z() : null;
            if (afxVarZ == null) {
                afxVarZ = afx.POST;
            }
            connection.setRequestMethod(afxVarZ.name());
            v(connection, Z2);
            URL url2 = connection.getURL();
            z2.rl("Request:\n");
            z2.nr("Id", requests.ty());
            Intrinsics.checkNotNullExpressionValue(url2, "url");
            z2.nr("URL", url2);
            String requestMethod = connection.getRequestMethod();
            Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            z2.nr("Method", requestMethod);
            String requestProperty = connection.getRequestProperty("User-Agent");
            Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            z2.nr("User-Agent", requestProperty);
            String requestProperty2 = connection.getRequestProperty("Content-Type");
            Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            z2.nr("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.Ik());
            connection.setReadTimeout(requests.Ik());
            if (afxVarZ != afx.POST) {
                z2.O();
                return;
            }
            connection.setDoOutput(true);
            try {
                OutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
                if (Z2) {
                    try {
                        bufferedOutputStream = new GZIPOutputStream(bufferedOutputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = bufferedOutputStream;
                        if (outputStream == null) {
                        }
                    }
                }
                try {
                    if (o(requests)) {
                        u uVar = new u(requests.qie());
                        e(requests, null, size, url2, uVar, Z2);
                        url = url2;
                        OutputStream outputStream2 = bufferedOutputStream;
                        try {
                            qfVar = new qf(outputStream2, requests, uVar.Z(), uVar.Uo());
                            Z2 = Z2;
                            size = size;
                            w6Var = this;
                            ciVar = requests;
                        } catch (Throwable th3) {
                            th = th3;
                            outputStream = outputStream2;
                            th = th;
                            if (outputStream == null) {
                            }
                        }
                    } else {
                        url = url2;
                        qfVar = bufferedOutputStream;
                        ciVar = requests;
                        w6Var = this;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStream = bufferedOutputStream;
                }
                try {
                    w6Var.e(ciVar, z2, size, url, qfVar, Z2);
                    qfVar.close();
                    z2.O();
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = qfVar;
                    th = th;
                    if (outputStream == null) {
                        throw th;
                    }
                    outputStream.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        public final List xMQ(ci requests) throws Throwable {
            Exception exc;
            HttpURLConnection httpURLConnectionRV9;
            List listHI;
            Intrinsics.checkNotNullParameter(requests, "requests");
            Lu.xMQ(requests, "requests");
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnectionRV9 = rV9(requests);
                exc = null;
            } catch (Exception e2) {
                exc = e2;
                httpURLConnectionRV9 = null;
            } catch (Throwable th) {
                th = th;
                vd.r(httpURLConnection);
                throw th;
            }
            try {
                if (httpURLConnectionRV9 != null) {
                    listHI = HI(httpURLConnectionRV9, requests);
                } else {
                    List listN = g9s.xMQ.n(requests.HI(), null, new FacebookException(exc));
                    X(requests, listN);
                    listHI = listN;
                }
                vd.r(httpURLConnectionRV9);
                return listHI;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnectionRV9;
                vd.r(httpURLConnection);
                throw th;
            }
        }

        private final void E2(String str, Object obj, I28 i28, boolean z2) {
            Class<?> cls = obj.getClass();
            if (JSONObject.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (z2) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String str2 = String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2));
                        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                        Object objOpt = jSONObject.opt(next);
                        Intrinsics.checkNotNullExpressionValue(objOpt, "jsonObject.opt(propertyName)");
                        E2(str2, objOpt, i28, z2);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    String strOptString = jSONObject.optString("id");
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"id\")");
                    E2(str, strOptString, i28, z2);
                    return;
                } else if (jSONObject.has("url")) {
                    String strOptString2 = jSONObject.optString("url");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObject.optString(\"url\")");
                    E2(str, strOptString2, i28, z2);
                    return;
                } else {
                    if (jSONObject.has("fbsdk:create_object")) {
                        String string = jSONObject.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
                        E2(str, string, i28, z2);
                        return;
                    }
                    return;
                }
            }
            if (JSONArray.class.isAssignableFrom(cls)) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str3 = String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                    Object objOpt2 = jSONArray.opt(i2);
                    Intrinsics.checkNotNullExpressionValue(objOpt2, "jsonArray.opt(i)");
                    E2(str3, objOpt2, i28, z2);
                }
                return;
            }
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.Date");
                    String str4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
                    Intrinsics.checkNotNullExpressionValue(str4, "iso8601DateFormat.format(date)");
                    i28.n(str, str4);
                    return;
                }
                vd.piY(GraphRequest.HI, "The type of property " + str + " in the graph object is unknown. It won't be sent in the request.");
                return;
            }
            i28.n(str, obj.toString());
        }

        private final void N(Map map, Wre wre) throws IOException {
            for (Map.Entry entry : map.entrySet()) {
                if (GraphRequest.ty.S(((j) entry.getValue()).rl())) {
                    wre.mUb((String) entry.getKey(), ((j) entry.getValue()).rl(), ((j) entry.getValue()).n());
                }
            }
        }

        private final HttpURLConnection Uo(URL url) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
            Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestProperty("User-Agent", r());
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final boolean XQ(String str) {
            Matcher matcher = GraphRequest.f52185r.matcher(str);
            if (matcher.matches()) {
                str = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(str, "matcher.group(1)");
            }
            if (StringsKt.startsWith$default(str, "me/", false, 2, (Object) null) || StringsKt.startsWith$default(str, "/me/", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        private final boolean Z(ci ciVar) {
            Iterator<E> it = ciVar.iterator();
            while (it.hasNext()) {
                GraphRequest graphRequest = (GraphRequest) it.next();
                Iterator<String> it2 = graphRequest.XQ().keySet().iterator();
                while (it2.hasNext()) {
                    if (S(graphRequest.XQ().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        private final String ck(ci ciVar) {
            String strGh = ciVar.gh();
            if (strGh != null && !ciVar.isEmpty()) {
                return strGh;
            }
            Iterator<E> it = ciVar.iterator();
            while (it.hasNext()) {
                AccessToken accessTokenAz = ((GraphRequest) it.next()).az();
                if (accessTokenAz != null) {
                    return accessTokenAz.getApplicationId();
                }
            }
            String str = GraphRequest.Ik;
            if (str != null && str.length() > 0) {
                return str;
            }
            return s4.az();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void fD(JSONObject jSONObject, String str, I28 i28) {
            boolean z2;
            boolean z3;
            if (XQ(str)) {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, ":", 0, false, 6, (Object) null);
                int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, "?", 0, false, 6, (Object) null);
                if (iIndexOf$default > 3 && (iIndexOf$default2 == -1 || iIndexOf$default < iIndexOf$default2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String key = itKeys.next();
                Object value = jSONObject.opt(key);
                if (z2 && StringsKt.equals(key, "image", true)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value, "value");
                E2(key, value, i28, z3);
            }
        }

        private final void nHg(Bundle bundle, Wre wre, GraphRequest graphRequest) throws IOException {
            for (String key : bundle.keySet()) {
                Object obj = bundle.get(key);
                if (WPU(obj)) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    wre.mUb(key, obj, graphRequest);
                }
            }
        }

        private final boolean o(ci ciVar) {
            for (ci.j jVar : ciVar.az()) {
            }
            Iterator<E> it = ciVar.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).HI();
            }
            return false;
        }

        private final String r() {
            if (GraphRequest.f52184o == null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", qwlyMfUJj.QmUdlTnaNT}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                GraphRequest.f52184o = str;
                String strN = com.facebook.internal.ci.n();
                if (!vd.I(strN)) {
                    String str2 = String.format(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.f52184o, strN}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
                    GraphRequest.f52184o = str2;
                }
            }
            return GraphRequest.f52184o;
        }
    }

    public /* synthetic */ GraphRequest(AccessToken accessToken, String str, Bundle bundle, afx afxVar, n nVar, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : accessToken, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : bundle, (i2 & 8) != 0 ? null : afxVar, (i2 & 16) != 0 ? null : nVar, (i2 & 32) != 0 ? null : str2);
    }

    public static final GraphRequest te(AccessToken accessToken, Ml ml) {
        return ty.ViF(accessToken, ml);
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i2 = 0; i2 < iNextInt; i2++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        ck = string;
        f52185r = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public GraphRequest(AccessToken accessToken, String str, Bundle bundle, afx afxVar, n nVar, String str2) {
        this.J2 = true;
        this.f52187n = accessToken;
        this.rl = str;
        this.xMQ = str2;
        fD(nVar);
        X(afxVar);
        if (bundle != null) {
            this.Uo = new Bundle(bundle);
        } else {
            this.Uo = new Bundle();
        }
        if (this.xMQ == null) {
            this.xMQ = s4.WPU();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iF(JSONArray jSONArray, Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.nr;
        if (str != null) {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
            jSONObject.put("omit_response_on_success", this.J2);
        }
        String str2 = this.f52186O;
        if (str2 != null) {
            jSONObject.put("depends_on", str2);
        }
        String strS = S();
        jSONObject.put("relative_url", strS);
        jSONObject.put("method", this.gh);
        AccessToken accessToken = this.f52187n;
        if (accessToken != null) {
            com.facebook.internal.Z.f52780O.nr(accessToken.getToken());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.Uo.keySet().iterator();
        while (it.hasNext()) {
            Object obj = this.Uo.get(it.next());
            if (ty.S(obj)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{FileUploadManager.f61570h, Integer.valueOf(map.size())}, 2));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                arrayList.add(str3);
                map.put(str3, new j(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put("attached_files", TextUtils.join(",", arrayList));
        }
        JSONObject jSONObject2 = this.f52188t;
        if (jSONObject2 != null) {
            ArrayList arrayList2 = new ArrayList();
            ty.fD(jSONObject2, strS, new CN3(arrayList2));
            jSONObject.put("body", TextUtils.join("&", arrayList2));
        }
        jSONArray.put(jSONObject);
    }

    private final String mUb(String str, boolean z2) {
        if (!z2 && this.gh == afx.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.Uo.keySet()) {
            Object obj = this.Uo.get(str2);
            if (obj == null) {
                obj = "";
            }
            w6 w6Var = ty;
            if (w6Var.WPU(obj)) {
                builderBuildUpon.appendQueryParameter(str2, w6Var.iF(obj).toString());
            } else if (this.gh != afx.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str3 = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                throw new IllegalArgumentException(str3);
            }
        }
        String string = builderBuildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uriBuilder.toString()");
        return string;
    }

    private final boolean nY() {
        if (this.rl == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("^/?");
        sb.append(s4.az());
        sb.append("/?.*");
        return this.qie || Pattern.matches(sb.toString(), this.rl) || Pattern.matches("^/?app/?.*", this.rl);
    }

    private final String o() {
        if (f52185r.matcher(this.rl).matches()) {
            return this.rl;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s/%s", Arrays.copyOf(new Object[]{this.xMQ, this.rl}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public static final void rl(n nVar, g9s response) {
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObjectT = response.t();
        JSONObject jSONObjectOptJSONObject = jSONObjectT != null ? jSONObjectT.optJSONObject("__debug__") : null;
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("messages") : null;
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("message") : null;
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("type") : null;
                String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("link") : null;
                if (strOptString != null && strOptString2 != null) {
                    Ew ew = Ew.GRAPH_API_DEBUG_INFO;
                    if (Intrinsics.areEqual(strOptString2, "warning")) {
                        ew = Ew.GRAPH_API_DEBUG_WARNING;
                    }
                    if (!vd.I(strOptString3)) {
                        strOptString = strOptString + " Link: " + strOptString3;
                    }
                    Z.j jVar = com.facebook.internal.Z.f52780O;
                    String TAG = HI;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    jVar.rl(ew, TAG, strOptString);
                }
            }
        }
        if (nVar != null) {
            nVar.n(response);
        }
    }

    private final String ty() {
        AccessToken accessToken = this.f52187n;
        if (accessToken != null) {
            if (!this.Uo.containsKey("access_token")) {
                String token = accessToken.getToken();
                com.facebook.internal.Z.f52780O.nr(token);
                return token;
            }
        } else if (!this.Uo.containsKey("access_token")) {
            return ck();
        }
        return this.Uo.getString("access_token");
    }

    private final void xMQ() {
        Bundle bundle = this.Uo;
        if (nHg()) {
            bundle.putString("access_token", ck());
        } else {
            String strTy = ty();
            if (strTy != null) {
                bundle.putString("access_token", strTy);
            }
        }
        if (!bundle.containsKey("access_token") && vd.I(s4.r())) {
            Log.w(HI, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
        }
        bundle.putString("sdk", AppLovinBridge.f61290h);
        bundle.putString("format", "json");
        if (s4.T(Ew.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", "info");
        } else if (s4.T(Ew.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", "warning");
        }
    }

    public final void E2(boolean z2) {
        this.qie = z2;
    }

    public final n HI() {
        return this.mUb;
    }

    public final JSONObject Ik() {
        return this.f52188t;
    }

    public final void N(Object obj) {
        this.KN = obj;
    }

    public final String S() {
        if (this.az != null) {
            throw new FacebookException("Can't override URL for a batch request");
        }
        String strViF = ViF(com.facebook.internal.qf.KN());
        xMQ();
        Uri uri = Uri.parse(mUb(strViF, true));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        return str;
    }

    public final void T(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.Uo = bundle;
    }

    public final Object WPU() {
        return this.KN;
    }

    public final void X(afx afxVar) {
        if (this.az != null && afxVar != afx.GET) {
            throw new FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (afxVar == null) {
            afxVar = afx.GET;
        }
        this.gh = afxVar;
    }

    public final Bundle XQ() {
        return this.Uo;
    }

    public final afx Z() {
        return this.gh;
    }

    public final String aYN() {
        String str = this.az;
        if (str != null) {
            return String.valueOf(str);
        }
        String str2 = this.rl;
        String strViF = ViF((this.gh == afx.POST && str2 != null && StringsKt.endsWith$default(str2, "/videos", false, 2, (Object) null)) ? com.facebook.internal.qf.mUb() : com.facebook.internal.qf.xMQ(s4.aYN()));
        xMQ();
        return mUb(strViF, false);
    }

    public final AccessToken az() {
        return this.f52187n;
    }

    public final void e(JSONObject jSONObject) {
        this.f52188t = jSONObject;
    }

    public final void fD(final n nVar) {
        if (s4.T(Ew.GRAPH_API_DEBUG_INFO) || s4.T(Ew.GRAPH_API_DEBUG_WARNING)) {
            this.mUb = new n() { // from class: com.facebook.UGc
                @Override // com.facebook.GraphRequest.n
                public final void n(g9s g9sVar) {
                    GraphRequest.rl(nVar, g9sVar);
                }
            };
        } else {
            this.mUb = nVar;
        }
    }

    public final g9s gh() {
        return ty.KN(this);
    }

    public final SPz qie() {
        return ty.ty(this);
    }

    public final String r() {
        return this.rl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Request: ");
        sb.append(" accessToken: ");
        Object obj = this.f52187n;
        if (obj == null) {
            obj = V8ValueNull.NULL;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.rl);
        sb.append(", graphObject: ");
        sb.append(this.f52188t);
        sb.append(", httpMethod: ");
        sb.append(this.gh);
        sb.append(", parameters: ");
        sb.append(this.Uo);
        sb.append("}");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return string;
    }

    private final String ViF(String str) {
        if (!g()) {
            str = com.facebook.internal.qf.J2();
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{str, o()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        return str2;
    }

    private final String ck() {
        String strAz = s4.az();
        String strR = s4.r();
        if (strAz.length() > 0 && strR.length() > 0) {
            return strAz + '|' + strR;
        }
        vd.piY(HI, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final boolean g() {
        if (!Intrinsics.areEqual(s4.aYN(), "instagram.com")) {
            return true;
        }
        return !nY();
    }

    private final boolean nHg() {
        boolean zContains$default;
        String strTy = ty();
        if (strTy != null) {
            zContains$default = StringsKt.contains$default((CharSequence) strTy, (CharSequence) l.ad, false, 2, (Object) null);
        } else {
            zContains$default = false;
        }
        if (strTy != null && StringsKt.startsWith$default(strTy, "IG", false, 2, (Object) null) && !zContains$default && nY()) {
            return true;
        }
        if (g() || zContains$default) {
            return false;
        }
        return true;
    }
}
