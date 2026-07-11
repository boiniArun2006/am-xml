package androidx.preference;

import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/preference/PreferenceGroupKt$children$1", "Lkotlin/sequences/Sequence;", "Landroidx/preference/Preference;", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "preference-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PreferenceGroupKt$children$1 implements Sequence<Preference> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ PreferenceGroup f40632n;

    @Override // kotlin.sequences.Sequence
    public Iterator<Preference> iterator() {
        return PreferenceGroupKt.n(this.f40632n);
    }
}
