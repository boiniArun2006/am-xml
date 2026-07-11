package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0018\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\u0017R.\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "<init>", "()V", "Landroidx/compose/runtime/MovableContent;", AppLovinEventTypes.USER_VIEWED_CONTENT, "Landroidx/compose/runtime/NestedMovableContent;", "nestedContent", "", c.f62177j, "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/NestedMovableContent;)V", "rl", "key", "nr", "(Landroidx/compose/runtime/MovableContent;)Landroidx/compose/runtime/NestedMovableContent;", "", "t", "(Landroidx/compose/runtime/MovableContent;)Z", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "O", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/collection/MutableScatterMap;", "contentMap", "containerMap", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MultiValueMap.kt\nandroidx/compose/runtime/collection/MultiValueMap\n+ 4 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1791:1\n1#2:1792\n118#3,4:1793\n123#3,4:1803\n287#4,6:1797\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/NestedContentMap\n*L\n1780#1:1793,4\n1780#1:1803,4\n1780#1:1797,6\n*E\n"})
final class NestedContentMap {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap contentMap = MultiValueMap.O(null, 1, null);

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final MutableScatterMap containerMap = MultiValueMap.O(null, 1, null);

    public final void O(final MovableContentStateReference reference) {
        Object objO = this.containerMap.O(reference);
        if (objO != null) {
            if (!(objO instanceof MutableObjectList)) {
                Intrinsics.checkNotNull(objO, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.ty(this.contentMap, (MovableContent) objO, new Function1<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(Intrinsics.areEqual(nestedMovableContent.getAndroidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER java.lang.String(), reference));
                    }
                });
                return;
            }
            ObjectList objectList = (ObjectList) objO;
            Object[] objArr = objectList.content;
            int i2 = objectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                MultiValueMap.ty(this.contentMap, (MovableContent) obj, new Function1<NestedMovableContent, Boolean>() { // from class: androidx.compose.runtime.NestedContentMap$usedContainer$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NestedMovableContent nestedMovableContent) {
                        return Boolean.valueOf(Intrinsics.areEqual(nestedMovableContent.getAndroidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER java.lang.String(), reference));
                    }
                });
            }
        }
    }

    public final void n(MovableContent content, NestedMovableContent nestedContent) {
        MultiValueMap.n(this.contentMap, content, nestedContent);
        MultiValueMap.n(this.containerMap, nestedContent.getAndroidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER java.lang.String(), content);
    }

    public final NestedMovableContent nr(MovableContent key) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.az(this.contentMap, key);
        if (MultiValueMap.mUb(this.contentMap)) {
            MultiValueMap.t(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void rl() {
        MultiValueMap.t(this.contentMap);
        MultiValueMap.t(this.containerMap);
    }

    public final boolean t(MovableContent key) {
        return MultiValueMap.J2(this.contentMap, key);
    }
}
