package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.safedk.android.analytics.brandsafety.l;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003LMNB!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\rJ\u001b\u0010#\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b#\u0010\u001cJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0006H\u0001¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00028\u0000¢\u0006\u0004\b0\u0010(J\u0015\u00101\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b1\u0010/J\u0015\u00102\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b2\u0010\rJ\u001b\u00103\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b3\u0010\u001cJ\u0015\u00104\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b4\u00105J\u001d\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0006H\u0001¢\u0006\u0004\b;\u0010&J\u001b\u0010<\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b<\u0010\u001cJ \u0010=\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b=\u0010>J%\u0010B\u001a\u00020\u000f2\u0016\u0010A\u001a\u0012\u0012\u0004\u0012\u00028\u00000?j\b\u0012\u0004\u0012\u00028\u0000`@¢\u0006\u0004\bB\u0010CR$\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0010\u0010D\u0012\u0004\bE\u0010!R\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010FR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", AppLovinEventTypes.USER_VIEWED_CONTENT, "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", "rl", "(Ljava/lang/Object;)Z", "index", "", c.f62177j, "(ILjava/lang/Object;)V", "", "elements", "O", "(ILjava/util/List;)Z", "t", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "", "nr", "(ILjava/util/Collection;)Z", "J2", "(Ljava/util/Collection;)Z", "", "Uo", "()Ljava/util/List;", "KN", "()V", "xMQ", "mUb", "capacity", "Z", "(I)V", "gh", "()Ljava/lang/Object;", "", "message", "", "ViF", "(Ljava/lang/String;)Ljava/lang/Void;", "az", "(Ljava/lang/Object;)I", "ty", "HI", "ck", "Ik", "r", "(I)Ljava/lang/Object;", TtmlNode.START, TtmlNode.END, "o", "(II)V", "newSize", "WPU", "XQ", "S", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "aYN", "(Ljava/util/Comparator;)V", "[Ljava/lang/Object;", "getContent$annotations", "Ljava/util/List;", "list", "<set-?>", "I", "qie", "()I", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1110:1\n289#1,4:1111\n289#1,4:1115\n289#1,4:1121\n289#1,4:1127\n289#1,4:1135\n289#1,4:1141\n44#1:1151\n472#1:1152\n48#1:1155\n472#1:1156\n44#1:1157\n472#1:1158\n516#1:1161\n332#1:1162\n472#1:1163\n516#1:1164\n472#1:1165\n516#1:1166\n44#1:1167\n472#1:1168\n516#1:1169\n44#1:1170\n472#1:1171\n472#1:1172\n472#1:1173\n44#1:1174\n472#1:1175\n44#1:1178\n44#1:1183\n44#1:1184\n472#1:1185\n27#2,2:1119\n27#2,2:1125\n27#2,2:1131\n27#2,2:1133\n27#2,2:1139\n27#2,2:1145\n27#2,2:1159\n27#2,2:1179\n27#2,2:1181\n1864#3,3:1147\n1855#3,2:1153\n1855#3,2:1176\n1#4:1150\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1111,4\n66#1:1115,4\n87#1:1121,4\n111#1:1127,4\n156#1:1135,4\n169#1:1141,4\n234#1:1151\n235#1:1152\n265#1:1155\n266#1:1156\n279#1:1157\n280#1:1158\n309#1:1161\n310#1:1162\n312#1:1163\n340#1:1164\n340#1:1165\n526#1:1166\n529#1:1167\n529#1:1168\n563#1:1169\n563#1:1170\n563#1:1171\n588#1:1172\n598#1:1173\n678#1:1174\n679#1:1175\n700#1:1178\n725#1:1183\n759#1:1184\n760#1:1185\n69#1:1119,2\n90#1:1125,2\n114#1:1131,2\n121#1:1133,2\n157#1:1139,2\n172#1:1145,2\n300#1:1159,2\n701#1:1179,2\n717#1:1181,2\n179#1:1147,3\n256#1:1153,2\n692#1:1176,2\n*E\n"})
public final class MutableVector<T> implements RandomAccess {
    public static final int J2 = 8;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Object[] content;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private List list;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0013\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u001f\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000eJ\u000f\u0010 \u001a\u00020\u001cH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b&\u0010\nJ\u001d\u0010'\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010(\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u0012J\u001d\u0010)\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010\u000eJ \u0010*\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "<init>", "(Landroidx/compose/runtime/collection/MutableVector;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "lastIndexOf", l.f62657l, "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "O", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", c.f62177j, "Landroidx/compose/runtime/collection/MutableVector;", "t", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1110:1\n472#2:1111\n516#2:1112\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n850#1:1111\n855#1:1112\n*E\n"})
    private static final class MutableVectorList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final MutableVector vector;

        @Override // java.util.List, java.util.Collection
        public boolean add(Object element) {
            return this.vector.rl(element);
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection elements) {
            return this.vector.nr(index, elements);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i2) {
            return O(i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, Object element) {
            this.vector.n(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            return this.vector.J2(elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.KN();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            return this.vector.xMQ(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            return this.vector.mUb(elements);
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            return this.vector.az(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            return this.vector.HI(element);
        }

        @Override // java.util.List
        public ListIterator listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            return this.vector.ck(element);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            return this.vector.Ik(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            return this.vector.XQ(elements);
        }

        public int t() {
            return this.vector.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        public MutableVectorList(MutableVector mutableVector) {
            this.vector = mutableVector;
        }

        public Object O(int index) {
            MutableVectorKt.n(this, index);
            return this.vector.r(index);
        }

        @Override // java.util.List
        public Object get(int index) {
            MutableVectorKt.n(this, index);
            return this.vector.content[index];
        }

        @Override // java.util.List
        public Object set(int index, Object element) {
            MutableVectorKt.n(this, index);
            return this.vector.S(index, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return t();
        }

        @Override // java.util.List
        public List subList(int fromIndex, int toIndex) {
            MutableVectorKt.rl(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010+\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\u001f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0010J\u000f\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010#2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\fJ\u001d\u0010(\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b(\u0010\u0010J\u0017\u0010)\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010\u0013J\u001d\u0010*\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b*\u0010\u0010J \u0010+\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00104R\u0014\u00106\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00105¨\u00067"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "list", "", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/util/List;II)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "lastIndexOf", l.f62657l, "", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "()V", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "O", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", c.f62177j, "Ljava/util/List;", "t", "I", "()I", "size", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1110:1\n1855#2,2:1111\n1855#2,2:1113\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n922#1:1111,2\n1006#1:1113,2\n*E\n"})
    private static final class SubList<T> implements List<T>, KMutableList {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private int end;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final List list;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final int start;

        @Override // java.util.List, java.util.Collection
        public boolean add(Object element) {
            List list = this.list;
            int i2 = this.end;
            this.end = i2 + 1;
            list.add(i2, element);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int index, Collection elements) {
            this.list.addAll(index + this.start, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i2) {
            return O(i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int index, Object element) {
            this.list.add(index + this.start, element);
            this.end++;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    this.list.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object element) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), element)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public int indexOf(Object element) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), element)) {
                    return i3 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object element) {
            int i2 = this.end - 1;
            int i3 = this.start;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i2), element)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.start;
        }

        @Override // java.util.List
        public ListIterator listIterator(int index) {
            return new VectorListIterator(this, index);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object element) {
            int i2 = this.end;
            for (int i3 = this.start; i3 < i2; i3++) {
                if (Intrinsics.areEqual(this.list.get(i3), element)) {
                    this.list.remove(i3);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            int i2 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i2 != this.end;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            int i2 = this.end;
            int i3 = i2 - 1;
            int i5 = this.start;
            if (i5 <= i3) {
                while (true) {
                    if (!elements.contains(this.list.get(i3))) {
                        this.list.remove(i3);
                        this.end--;
                    }
                    if (i3 == i5) {
                        break;
                    }
                    i3--;
                }
            }
            return i2 != this.end;
        }

        public int t() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        public SubList(List list, int i2, int i3) {
            this.list = list;
            this.start = i2;
            this.end = i3;
        }

        public Object O(int index) {
            MutableVectorKt.n(this, index);
            this.end--;
            return this.list.remove(index + this.start);
        }

        @Override // java.util.List
        public Object get(int index) {
            MutableVectorKt.n(this, index);
            return this.list.get(index + this.start);
        }

        @Override // java.util.List
        public Object set(int index, Object element) {
            MutableVectorKt.n(this, index);
            return this.list.set(index + this.start, element);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return t();
        }

        @Override // java.util.List
        public List subList(int fromIndex, int toIndex) {
            MutableVectorKt.rl(this, fromIndex, toIndex);
            return new SubList(this, fromIndex, toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            this.list.addAll(this.end, elements);
            int size = elements.size();
            this.end += size;
            return size > 0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "list", "", "index", "<init>", "(Ljava/util/List;I)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "hasPrevious", "nextIndex", "()I", "previous", "previousIndex", "element", l.f62657l, "(Ljava/lang/Object;)V", "set", c.f62177j, "Ljava/util/List;", "t", "I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final List list;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private int index;

        @Override // java.util.ListIterator
        public void add(Object element) {
            this.list.add(this.index, element);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.list;
            int i2 = this.index;
            this.index = i2 + 1;
            return list.get(i2);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i2 = this.index - 1;
            this.index = i2;
            return this.list.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            this.list.remove(i2);
        }

        @Override // java.util.ListIterator
        public void set(Object element) {
            this.list.set(this.index, element);
        }

        public VectorListIterator(List list, int i2) {
            this.list = list;
            this.index = i2;
        }
    }

    public final int HI(Object element) {
        Object[] objArr = this.content;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            if (Intrinsics.areEqual(element, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean J2(Collection elements) {
        return nr(this.size, elements);
    }

    public final void KN() {
        Object[] objArr = this.content;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.size = 0;
    }

    public final Object S(int index, Object element) {
        Object[] objArr = this.content;
        Object obj = objArr[index];
        objArr[index] = element;
        return obj;
    }

    public final List Uo() {
        List list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final Void ViF(String message) {
        throw new NoSuchElementException(message);
    }

    public final void WPU(int newSize) {
        this.size = newSize;
    }

    public final boolean XQ(Collection elements) {
        int i2 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(this.content[size])) {
                r(size);
            }
        }
        return i2 != this.size;
    }

    public final void Z(int capacity) {
        Object[] objArr = this.content;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(capacity, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.content = objArr2;
    }

    public final void aYN(Comparator comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.size);
    }

    public final int az(Object element) {
        Object[] objArr = this.content;
        int i2 = this.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (Intrinsics.areEqual(element, objArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean mUb(Collection elements) {
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!xMQ(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void n(int index, Object element) {
        int i2 = this.size + 1;
        if (this.content.length < i2) {
            Z(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(objArr, index, objArr, index + 1, i3 - index);
        }
        objArr[index] = element;
        this.size++;
    }

    public final void o(int start, int end) {
        if (end > start) {
            int i2 = this.size;
            if (end < i2) {
                Object[] objArr = this.content;
                System.arraycopy(objArr, end, objArr, start, i2 - end);
            }
            int i3 = this.size - (end - start);
            int size = getSize() - 1;
            if (i3 <= size) {
                int i5 = i3;
                while (true) {
                    this.content[i5] = null;
                    if (i5 == size) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.size = i3;
        }
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final Object r(int index) {
        Object[] objArr = this.content;
        Object obj = objArr[index];
        if (index != getSize() - 1) {
            int i2 = index + 1;
            System.arraycopy(objArr, i2, objArr, index, this.size - i2);
        }
        int i3 = this.size - 1;
        this.size = i3;
        objArr[i3] = null;
        return obj;
    }

    public final boolean rl(Object element) {
        int i2 = this.size + 1;
        if (this.content.length < i2) {
            Z(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        objArr[i3] = element;
        this.size = i3 + 1;
        return true;
    }

    public final boolean t(int index, MutableVector elements) {
        int i2 = elements.size;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.size + i2;
        if (this.content.length < i3) {
            Z(i3);
        }
        Object[] objArr = this.content;
        int i5 = this.size;
        if (index != i5) {
            System.arraycopy(objArr, index, objArr, index + i2, i5 - index);
        }
        System.arraycopy(elements.content, 0, objArr, index, i2);
        this.size += i2;
        return true;
    }

    public MutableVector(Object[] objArr, int i2) {
        this.content = objArr;
        this.size = i2;
    }

    public final boolean Ik(Collection elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int i2 = this.size;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            ck(it.next());
        }
        if (i2 == this.size) {
            return false;
        }
        return true;
    }

    public final boolean O(int index, List elements) {
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i2 = this.size + size;
        if (this.content.length < i2) {
            Z(i2);
        }
        Object[] objArr = this.content;
        int i3 = this.size;
        if (index != i3) {
            System.arraycopy(objArr, index, objArr, index + size, i3 - index);
        }
        int size2 = elements.size();
        for (int i5 = 0; i5 < size2; i5++) {
            objArr[index + i5] = elements.get(i5);
        }
        this.size += size;
        return true;
    }

    public final boolean ck(Object element) {
        int iAz = az(element);
        if (iAz >= 0) {
            r(iAz);
            return true;
        }
        return false;
    }

    public final Object gh() {
        if (getSize() != 0) {
            return this.content[0];
        }
        ViF("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean nr(int index, Collection elements) {
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = elements.size();
        int i3 = this.size + size;
        if (this.content.length < i3) {
            Z(i3);
        }
        Object[] objArr = this.content;
        int i5 = this.size;
        if (index != i5) {
            System.arraycopy(objArr, index, objArr, index + size, i5 - index);
        }
        for (T t3 : elements) {
            int i7 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr[i2 + index] = t3;
            i2 = i7;
        }
        this.size += size;
        return true;
    }

    public final Object ty() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        ViF("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean xMQ(Object element) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i2 = 0; !Intrinsics.areEqual(this.content[i2], element); i2++) {
                if (i2 != size) {
                }
            }
            return true;
        }
        return false;
    }
}
