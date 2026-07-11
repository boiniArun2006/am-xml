package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.unit.IntRect;
import com.caoccao.javet.exceptions.JavetError;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b \u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b&\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/tooling/ViewInfo;", "", "", "fileName", "", JavetError.PARAMETER_LINE_NUMBER, "Landroidx/compose/ui/unit/IntRect;", "bounds", "Landroidx/compose/ui/tooling/data/SourceLocation;", "location", "", "children", "layoutInfo", "<init>", "(Ljava/lang/String;ILandroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/tooling/data/SourceLocation;Ljava/util/List;Ljava/lang/Object;)V", "", "KN", "()Z", c.f62177j, "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "nr", "rl", "I", "J2", "t", "Landroidx/compose/ui/unit/IntRect;", "()Landroidx/compose/ui/unit/IntRect;", "Landroidx/compose/ui/tooling/data/SourceLocation;", "Uo", "()Landroidx/compose/ui/tooling/data/SourceLocation;", "O", "Ljava/util/List;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,642:1\n1360#2:643\n1446#2,5:644\n1#3:649\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n*L\n97#1:643\n97#1:644,5\n*E\n"})
public final /* data */ class ViewInfo {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public final Object layoutInfo;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final List children;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final String fileName;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public final SourceLocation location;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public final int lineNumber;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final IntRect bounds;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo = (ViewInfo) other;
        return Intrinsics.areEqual(this.fileName, viewInfo.fileName) && this.lineNumber == viewInfo.lineNumber && Intrinsics.areEqual(this.bounds, viewInfo.bounds) && Intrinsics.areEqual(this.location, viewInfo.location) && Intrinsics.areEqual(this.children, viewInfo.children) && Intrinsics.areEqual(this.layoutInfo, viewInfo.layoutInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.fileName.hashCode() * 31) + Integer.hashCode(this.lineNumber)) * 31) + this.bounds.hashCode()) * 31;
        SourceLocation sourceLocation = this.location;
        int iHashCode2 = (((iHashCode + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31) + this.children.hashCode()) * 31;
        Object obj = this.layoutInfo;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final int getLineNumber() {
        return this.lineNumber;
    }

    public final boolean KN() {
        return (this.bounds.getBottom() == 0 || this.bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Object getLayoutInfo() {
        return this.layoutInfo;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public final SourceLocation getLocation() {
        return this.location;
    }

    public final List n() {
        List list = this.children;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((ViewInfo) it.next()).n());
        }
        return CollectionsKt.plus((Collection) list, (Iterable) arrayList);
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final IntRect getBounds() {
        return this.bounds;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getChildren() {
        return this.children;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.fileName);
        sb.append(':');
        sb.append(this.lineNumber);
        sb.append(",\n            |bounds=(top=");
        sb.append(this.bounds.getTop());
        sb.append(", left=");
        sb.append(this.bounds.getLeft());
        sb.append(",\n            |location=");
        SourceLocation sourceLocation = this.location;
        if (sourceLocation != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('(');
            sb2.append(sourceLocation.getOffset());
            sb2.append('L');
            sb2.append(sourceLocation.getLength());
            string = sb2.toString();
            if (string == null) {
                string = "<none>";
            }
        }
        sb.append(string);
        sb.append("\n            |bottom=");
        sb.append(this.bounds.getBottom());
        sb.append(", right=");
        sb.append(this.bounds.getAndroidx.media3.extractor.text.ttml.TtmlNode.RIGHT java.lang.String());
        sb.append("),\n            |childrenCount=");
        sb.append(this.children.size());
        sb.append(')');
        return StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }

    public ViewInfo(String str, int i2, IntRect intRect, SourceLocation sourceLocation, List list, Object obj) {
        this.fileName = str;
        this.lineNumber = i2;
        this.bounds = intRect;
        this.location = sourceLocation;
        this.children = list;
        this.layoutInfo = obj;
    }
}
