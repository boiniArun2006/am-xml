package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.exoplayer2.C;
import com.safedk.android.analytics.AppLovinBridge;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode gh = PorterDuff.Mode.SRC_IN;
    public int J2;
    PorterDuff.Mode KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f36437O;
    public ColorStateList Uo;
    public String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36438n;
    public Parcelable nr;
    Object rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte[] f36439t;
    public String xMQ;

    @RequiresApi
    static class Api23Impl {
        static Uri O(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.nr(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            }
        }

        static Icon Uo(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f36438n) {
                case -1:
                    return (Icon) iconCompat.rl;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.rl);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.ty(), iconCompat.f36437O);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.rl, iconCompat.f36437O, iconCompat.J2);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.rl);
                    break;
                case 5:
                    iconCreateWithBitmap = Build.VERSION.SDK_INT < 26 ? Icon.createWithBitmap(IconCompat.nr((Bitmap) iconCompat.rl, false)) : Api26Impl.n((Bitmap) iconCompat.rl);
                    break;
                case 6:
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30) {
                        iconCreateWithBitmap = Api30Impl.n(iconCompat.Ik());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.Ik());
                        }
                        InputStream inputStreamR = iconCompat.r(context);
                        if (inputStreamR == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.Ik());
                        }
                        if (i2 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.nr(BitmapFactory.decodeStream(inputStreamR), false));
                        } else {
                            iconCreateWithBitmap = Api26Impl.n(BitmapFactory.decodeStream(inputStreamR));
                        }
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.Uo;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.KN;
            if (mode != IconCompat.gh) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        static int nr(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.t(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                return -1;
            }
        }

        static int rl(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.n(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            }
        }

        static String t(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.rl(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (InvocationTargetException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            }
        }

        static Drawable J2(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static IconCompat n(Object obj) {
            Preconditions.Uo(obj);
            int iNr = nr(obj);
            if (iNr != 2) {
                if (iNr != 4) {
                    if (iNr != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.rl = obj;
                        return iconCompat;
                    }
                    return IconCompat.O(O(obj));
                }
                return IconCompat.KN(O(obj));
            }
            return IconCompat.gh(null, t(obj), rl(obj));
        }
    }

    @RequiresApi
    static class Api28Impl {
        static int n(Object obj) {
            return ((Icon) obj).getResId();
        }

        static Uri nr(Object obj) {
            return ((Icon) obj).getUri();
        }

        static String rl(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int t(Object obj) {
            return ((Icon) obj).getType();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface IconType {
    }

    @RestrictTo
    public IconCompat() {
        this.f36438n = -1;
        this.f36439t = null;
        this.nr = null;
        this.f36437O = 0;
        this.J2 = 0;
        this.Uo = null;
        this.KN = gh;
        this.xMQ = null;
    }

    public Icon WPU() {
        return aYN(null);
    }

    @RequiresApi
    static class Api26Impl {
        static Icon n(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi
    static class Api30Impl {
        static Icon n(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static Resources HI(Context context, String str) {
        if (AppLovinBridge.f61290h.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    public static IconCompat rl(Bundle bundle) {
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.f36437O = bundle.getInt("int1");
        iconCompat.J2 = bundle.getInt("int2");
        iconCompat.mUb = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.Uo = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.KN = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                iconCompat.rl = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i2);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.rl = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.rl = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public Uri Ik() {
        int i2 = this.f36438n;
        if (i2 == -1) {
            return Api23Impl.O(this.rl);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.rl);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public Bundle S() {
        Bundle bundle = new Bundle();
        switch (this.f36438n) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.rl);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.rl);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.rl);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.rl);
                break;
        }
        bundle.putInt("type", this.f36438n);
        bundle.putInt("int1", this.f36437O);
        bundle.putInt("int2", this.J2);
        bundle.putString("string1", this.mUb);
        ColorStateList colorStateList = this.Uo;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.KN;
        if (mode != gh) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public void XQ(boolean z2) {
        this.xMQ = this.KN.name();
        switch (this.f36438n) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.nr = (Parcelable) this.rl;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z2) {
                    this.nr = (Parcelable) this.rl;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.rl;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f36439t = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f36439t = ((String) this.rl).getBytes(Charset.forName(C.UTF16_NAME));
                return;
            case 3:
                this.f36439t = (byte[]) this.rl;
                return;
            case 4:
            case 6:
                this.f36439t = this.rl.toString().getBytes(Charset.forName(C.UTF16_NAME));
                return;
        }
    }

    public void Z() {
        this.KN = PorterDuff.Mode.valueOf(this.xMQ);
        switch (this.f36438n) {
            case -1:
                Parcelable parcelable = this.nr;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.rl = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.nr;
                if (parcelable2 != null) {
                    this.rl = parcelable2;
                    return;
                }
                byte[] bArr = this.f36439t;
                this.rl = bArr;
                this.f36438n = 3;
                this.f36437O = 0;
                this.J2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f36439t, Charset.forName(C.UTF16_NAME));
                this.rl = str;
                if (this.f36438n == 2 && this.mUb == null) {
                    this.mUb = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.rl = this.f36439t;
                return;
        }
    }

    public int az() {
        int i2 = this.f36438n;
        if (i2 == -1) {
            return Api23Impl.rl(this.rl);
        }
        if (i2 == 2) {
            return this.f36437O;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public int ck() {
        int i2 = this.f36438n;
        return i2 == -1 ? Api23Impl.nr(this.rl) : i2;
    }

    public void n(Context context) {
        Object obj;
        if (this.f36438n != 2 || (obj = this.rl) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strTy = ty();
            int identifier = HI(context, strTy).getIdentifier(str4, str3, str5);
            if (this.f36437O != identifier) {
                Log.i("IconCompat", "Id has changed for " + strTy + " " + str);
                this.f36437O = identifier;
            }
        }
    }

    public Bitmap qie() {
        int i2 = this.f36438n;
        if (i2 == -1) {
            Object obj = this.rl;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.rl;
        }
        if (i2 == 5) {
            return nr((Bitmap) this.rl, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public String toString() {
        if (this.f36438n == -1) {
            return String.valueOf(this.rl);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(ViF(this.f36438n));
        switch (this.f36438n) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.rl).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.rl).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mUb);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(az())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f36437O);
                if (this.J2 != 0) {
                    sb.append(" off=");
                    sb.append(this.J2);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.rl);
                break;
        }
        if (this.Uo != null) {
            sb.append(" tint=");
            sb.append(this.Uo);
        }
        if (this.KN != gh) {
            sb.append(" mode=");
            sb.append(this.KN);
        }
        sb.append(")");
        return sb.toString();
    }

    public String ty() {
        int i2 = this.f36438n;
        if (i2 == -1) {
            return Api23Impl.t(this.rl);
        }
        if (i2 == 2) {
            String str = this.mUb;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.rl).split(":", -1)[0] : this.mUb;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public static IconCompat J2(String str) {
        ObjectsCompat.t(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.rl = str;
        return iconCompat;
    }

    public static IconCompat KN(Uri uri) {
        ObjectsCompat.t(uri);
        return xMQ(uri.toString());
    }

    public static IconCompat O(Uri uri) {
        ObjectsCompat.t(uri);
        return J2(uri.toString());
    }

    public static IconCompat Uo(Bitmap bitmap) {
        ObjectsCompat.t(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.rl = bitmap;
        return iconCompat;
    }

    private static String ViF(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat gh(Resources resources, String str, int i2) {
        ObjectsCompat.t(str);
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f36437O = i2;
            if (resources != null) {
                try {
                    iconCompat.rl = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.rl = str;
            }
            iconCompat.mUb = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static IconCompat mUb(Context context, int i2) {
        ObjectsCompat.t(context);
        return gh(context.getResources(), context.getPackageName(), i2);
    }

    static Bitmap nr(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f3 = iMin;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z2) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat t(Icon icon) {
        return Api23Impl.n(icon);
    }

    public static IconCompat xMQ(String str) {
        ObjectsCompat.t(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.rl = str;
        return iconCompat;
    }

    public Icon aYN(Context context) {
        return Api23Impl.Uo(this, context);
    }

    public Drawable o(Context context) {
        n(context);
        return Api23Impl.J2(aYN(context), context);
    }

    public InputStream r(Context context) {
        Uri uriIk = Ik();
        String scheme = uriIk.getScheme();
        if (!AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme) && !FileUploadManager.f61570h.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.rl));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + uriIk, e2);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(uriIk);
        } catch (Exception e3) {
            Log.w("IconCompat", "Unable to load image from URI: " + uriIk, e3);
            return null;
        }
    }

    IconCompat(int i2) {
        this.f36439t = null;
        this.nr = null;
        this.f36437O = 0;
        this.J2 = 0;
        this.Uo = null;
        this.KN = gh;
        this.xMQ = null;
        this.f36438n = i2;
    }
}
