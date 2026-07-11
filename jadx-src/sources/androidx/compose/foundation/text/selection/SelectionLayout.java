package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001eR\u0014\u0010%\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001eR\u0014\u0010(\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayout;", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "block", "J2", "(Lkotlin/jvm/functions/Function1;)V", InneractiveMediationNameConsts.OTHER, "", "xMQ", "(Landroidx/compose/foundation/text/selection/SelectionLayout;)Z", "Landroidx/compose/foundation/text/selection/Selection;", "selection", "Landroidx/collection/LongObjectMap;", "KN", "(Landroidx/compose/foundation/text/selection/Selection;)Landroidx/collection/LongObjectMap;", "", "getSize", "()I", "size", "qie", "startSlot", "nr", "endSlot", "Landroidx/compose/foundation/text/selection/CrossStatus;", "O", "()Landroidx/compose/foundation/text/selection/CrossStatus;", "crossStatus", "gh", "()Landroidx/compose/foundation/text/selection/SelectableInfo;", "startInfo", "mUb", "endInfo", "rl", "currentInfo", "t", "firstInfo", c.f62177j, "()Z", "isStartHandle", "Uo", "()Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SelectionLayout {
    void J2(Function1 block);

    LongObjectMap KN(Selection selection);

    CrossStatus O();

    Selection Uo();

    int getSize();

    SelectableInfo gh();

    SelectableInfo mUb();

    boolean n();

    int nr();

    int qie();

    SelectableInfo rl();

    SelectableInfo t();

    boolean xMQ(SelectionLayout other);
}
