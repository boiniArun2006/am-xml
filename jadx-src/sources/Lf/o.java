package Lf;

import Be4.C1310m;
import Be4.P;
import Lf.Dsr;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.util.List;
import kYF.l3D;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o implements Dsr {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f6172t = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6173n;
    private final FjR.C rl;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n implements Dsr.j {
        private final boolean t(Uri uri) {
            return Intrinsics.areEqual(uri.getScheme(), "android.resource");
        }

        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Uri uri, FjR.C c2, eQ.fuX fux) {
            if (!t(uri)) {
                return null;
            }
            return new o(uri, c2);
        }
    }

    private final Void rl(Uri uri) {
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        Integer intOrNull;
        String authority = this.f6173n.getAuthority();
        if (authority != null) {
            if (StringsKt.isBlank(authority)) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) CollectionsKt.lastOrNull((List) this.f6173n.getPathSegments());
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    rl(this.f6173n);
                    throw new KotlinNothingValueException();
                }
                int iIntValue = intOrNull.intValue();
                Context contextUo = this.rl.Uo();
                Resources resources = Intrinsics.areEqual(authority, contextUo.getPackageName()) ? contextUo.getResources() : contextUo.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String strMUb = kYF.C.mUb(MimeTypeMap.getSingleton(), charSequence.subSequence(StringsKt.lastIndexOf$default(charSequence, '/', 0, false, 6, (Object) null), charSequence.length()).toString());
                if (!Intrinsics.areEqual(strMUb, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new qz(P.J2(Okio.buffer(Okio.source(resources.openRawResource(iIntValue, typedValue2))), contextUo, new C1310m(authority, iIntValue, typedValue2.density)), strMUb, Be4.CN3.f516O);
                }
                Drawable drawableN = Intrinsics.areEqual(authority, contextUo.getPackageName()) ? kYF.Ml.n(contextUo, iIntValue) : kYF.Ml.nr(contextUo, resources, iIntValue);
                boolean Z2 = kYF.C.Z(drawableN);
                if (Z2) {
                    drawableN = new BitmapDrawable(contextUo.getResources(), l3D.f69954n.n(drawableN, this.rl.J2(), this.rl.HI(), this.rl.ty(), this.rl.t()));
                }
                return new CN3(drawableN, Z2, Be4.CN3.f516O);
            }
        }
        rl(this.f6173n);
        throw new KotlinNothingValueException();
    }

    public o(Uri uri, FjR.C c2) {
        this.f6173n = uri;
        this.rl = c2;
    }
}
