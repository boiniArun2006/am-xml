package androidx.compose.ui.autofill;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0083@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/autofill/AndroidContentDataType;", "Landroidx/compose/ui/autofill/ContentDataType;", "", "androidAutofillType", "rl", "(I)I", "", "O", "(I)Ljava/lang/String;", "nr", "", InneractiveMediationNameConsts.OTHER, "", "t", "(ILjava/lang/Object;)Z", "I", "getAndroidAutofillType", "()I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
final class AndroidContentDataType implements ContentDataType {

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final int androidAutofillType;

    public static String O(int i2) {
        return "AndroidContentDataType(androidAutofillType=" + i2 + ')';
    }

    public static final /* synthetic */ AndroidContentDataType n(int i2) {
        return new AndroidContentDataType(i2);
    }

    public static int nr(int i2) {
        return Integer.hashCode(i2);
    }

    public static int rl(int i2) {
        return i2;
    }

    public static boolean t(int i2, Object obj) {
        return (obj instanceof AndroidContentDataType) && i2 == ((AndroidContentDataType) obj).getAndroidAutofillType();
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final /* synthetic */ int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public boolean equals(Object obj) {
        return t(this.androidAutofillType, obj);
    }

    public int hashCode() {
        return nr(this.androidAutofillType);
    }

    public String toString() {
        return O(this.androidAutofillType);
    }

    private /* synthetic */ AndroidContentDataType(int i2) {
        this.androidAutofillType = i2;
    }
}
