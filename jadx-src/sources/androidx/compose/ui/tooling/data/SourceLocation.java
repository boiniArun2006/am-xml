package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@UiToolingDataApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/tooling/data/SourceLocation;", "", "", JavetError.PARAMETER_LINE_NUMBER, "offset", "length", "", "sourceFile", "packageHash", "<init>", "(IIILjava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", c.f62177j, "I", "rl", "t", "nr", "Ljava/lang/String;", "O", "getPackageHash", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SourceLocation {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final int packageHash;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lineNumber;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata and from toString */
    private final String sourceFile;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
    private final int offset;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final int length;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SourceLocation)) {
            return false;
        }
        SourceLocation sourceLocation = (SourceLocation) other;
        return this.lineNumber == sourceLocation.lineNumber && this.offset == sourceLocation.offset && this.length == sourceLocation.length && Intrinsics.areEqual(this.sourceFile, sourceLocation.sourceFile) && this.packageHash == sourceLocation.packageHash;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.lineNumber) * 31) + Integer.hashCode(this.offset)) * 31) + Integer.hashCode(this.length)) * 31;
        String str = this.sourceFile;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.packageHash);
    }

    public String toString() {
        return "SourceLocation(lineNumber=" + this.lineNumber + ", offset=" + this.offset + ", length=" + this.length + ", sourceFile=" + this.sourceFile + ", packageHash=" + this.packageHash + ')';
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getSourceFile() {
        return this.sourceFile;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final int getOffset() {
        return this.offset;
    }

    public SourceLocation(int i2, int i3, int i5, String str, int i7) {
        this.lineNumber = i2;
        this.offset = i3;
        this.length = i5;
        this.sourceFile = str;
        this.packageHash = i7;
    }
}
