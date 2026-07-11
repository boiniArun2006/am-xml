package androidx.compose.ui.tooling.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UiToolingDataApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0003\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001cR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b \u0010$R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\"\u0010$R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/data/SourceInformationContext;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "sourceFile", "", "packageHash", "", "Landroidx/compose/ui/tooling/data/SourceLocationInfo;", "locations", "repeatOffset", "Landroidx/compose/ui/tooling/data/Parameter;", "parameters", "", "isCall", "isInline", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;ILjava/util/List;ZZ)V", "Landroidx/compose/ui/tooling/data/SourceLocation;", "Uo", "()Landroidx/compose/ui/tooling/data/SourceLocation;", c.f62177j, "Ljava/lang/String;", "()Ljava/lang/String;", "rl", "nr", "t", "I", "()I", "Ljava/util/List;", "getLocations", "()Ljava/util/List;", "O", "getRepeatOffset", "J2", "Z", "()Z", "KN", "xMQ", "nextLocation", "ui-tooling-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SourceInformationContext {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List parameters;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean isInline;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final int repeatOffset;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final boolean isCall;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final List locations;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final String sourceFile;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int packageHash;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int nextLocation;

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final boolean getIsInline() {
        return this.isInline;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getIsCall() {
        return this.isCall;
    }

    public final SourceLocation Uo() {
        int i2;
        if (this.nextLocation >= this.locations.size() && (i2 = this.repeatOffset) >= 0) {
            this.nextLocation = i2;
        }
        if (this.nextLocation >= this.locations.size()) {
            return null;
        }
        List list = this.locations;
        int i3 = this.nextLocation;
        this.nextLocation = i3 + 1;
        SourceLocationInfo sourceLocationInfo = (SourceLocationInfo) list.get(i3);
        Integer lineNumber = sourceLocationInfo.getLineNumber();
        int iIntValue = lineNumber != null ? lineNumber.intValue() : -1;
        Integer offset = sourceLocationInfo.getOffset();
        int iIntValue2 = offset != null ? offset.intValue() : -1;
        Integer length = sourceLocationInfo.getLength();
        return new SourceLocation(iIntValue, iIntValue2, length != null ? length.intValue() : -1, this.sourceFile, this.packageHash);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getSourceFile() {
        return this.sourceFile;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final int getPackageHash() {
        return this.packageHash;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getParameters() {
        return this.parameters;
    }

    public SourceInformationContext(String str, String str2, int i2, List list, int i3, List list2, boolean z2, boolean z3) {
        this.name = str;
        this.sourceFile = str2;
        this.packageHash = i2;
        this.locations = list;
        this.repeatOffset = i3;
        this.parameters = list2;
        this.isCall = z2;
        this.isInline = z3;
    }
}
