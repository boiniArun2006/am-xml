package androidx.preference;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", "", "hasNext", "()Z", "t", "()Landroidx/preference/Preference;", "", "remove", "()V", "", c.f62177j, "I", "index", "preference-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PreferenceGroupKt$iterator$1 implements Iterator<Preference>, KMutableIterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ PreferenceGroup f40634t;

    PreferenceGroupKt$iterator$1(PreferenceGroup preferenceGroup) {
        this.f40634t = preferenceGroup;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.f40634t.tUK();
    }

    @Override // java.util.Iterator
    public void remove() {
        PreferenceGroup preferenceGroup = this.f40634t;
        int i2 = this.index - 1;
        this.index = i2;
        preferenceGroup.kSg(preferenceGroup.How(i2));
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Preference next() {
        PreferenceGroup preferenceGroup = this.f40634t;
        int i2 = this.index;
        this.index = i2 + 1;
        Preference preferenceHow = preferenceGroup.How(i2);
        Intrinsics.checkNotNullExpressionValue(preferenceHow, "getPreference(index++)");
        return preferenceHow;
    }
}
