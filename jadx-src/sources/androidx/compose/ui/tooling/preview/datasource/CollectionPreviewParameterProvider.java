package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "", c.f62177j, "Ljava/util/Collection;", "collection", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", IV8ValueMap.FUNCTION_VALUES, "ui-tooling-preview_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class CollectionPreviewParameterProvider<T> implements PreviewParameterProvider<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Collection collection;

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence getValues() {
        return CollectionsKt.asSequence(this.collection);
    }
}
