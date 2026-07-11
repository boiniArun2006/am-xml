package androidx.compose.ui.node;

import androidx.collection.MutableLongList;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.caoccao.javet.values.reference.builtin.V8ValueBuiltInSymbol;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002IJB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0004J\u001d\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010\u0013J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0096\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b1\u0010,J\u0015\u00103\u001a\b\u0012\u0004\u0012\u00020\u000202H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u0002022\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u00105J%\u00108\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0016¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010\u0004R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010AR\u0016\u0010E\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006K"}, d2 = {"Landroidx/compose/ui/node/HitTestResult;", "", "Landroidx/compose/ui/Modifier$Node;", "<init>", "()V", "Landroidx/compose/ui/node/DistanceAndFlags;", "gh", "()J", "", "depth", "", "o", "(I)V", "startDepth", "endDepth", "XQ", "(II)V", "", "ty", "()Z", "t", "", "distanceFromEdge", "isInLayer", "Ik", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "HI", "(Landroidx/compose/ui/Modifier$Node;ZLkotlin/jvm/functions/Function0;)V", "S", "(Landroidx/compose/ui/Modifier$Node;FZLkotlin/jvm/functions/Function0;)V", "element", "mUb", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "qie", "(I)Landroidx/compose/ui/Modifier$Node;", "ck", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "r", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "Landroidx/collection/MutableObjectList;", "", c.f62177j, "Landroidx/collection/MutableObjectList;", IV8ValueMap.FUNCTION_VALUES, "Landroidx/collection/MutableLongList;", "Landroidx/collection/MutableLongList;", "distanceFromEdgeAndFlags", "O", "I", "hitDepth", "az", "()I", "size", "HitTestResultIterator", "SubList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n100#1:411\n113#1,10:412\n113#1,10:422\n113#1,10:432\n113#1,10:442\n113#1,10:452\n100#1:462\n113#1,10:463\n100#1:473\n113#1,10:474\n1855#2,2:484\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n92#1:411\n92#1:412,10\n100#1:422,10\n131#1:432,10\n144#1:442,10\n156#1:452,10\n176#1:462\n176#1:463,10\n194#1:473\n194#1:474,10\n249#1:484,2\n*E\n"})
public final class HitTestResult implements List<Modifier.Node>, KMappedMarker {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private MutableObjectList values = new MutableObjectList(16);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private MutableLongList distanceFromEdgeAndFlags = new MutableLongList(16);

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int hitDepth = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$HitTestResultIterator;", "", "Landroidx/compose/ui/Modifier$Node;", "", "index", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/HitTestResult;III)V", "", "hasNext", "()Z", "hasPrevious", "t", "()Landroidx/compose/ui/Modifier$Node;", "nextIndex", "()I", "O", "previousIndex", c.f62177j, "I", "getIndex", "setIndex", "(I)V", "getMinIndex", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class HitTestResultIterator implements ListIterator<Modifier.Node>, KMappedMarker {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        public HitTestResultIterator(int i2, int i3, int i5) {
            this.index = i2;
            this.minIndex = i3;
            this.maxIndex = i5;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Modifier.Node previous() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i2 = this.index - 1;
            this.index = i2;
            Object objNr = mutableObjectList.nr(i2);
            Intrinsics.checkNotNull(objNr, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objNr;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.maxIndex;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > this.minIndex;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index - this.minIndex;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.index - this.minIndex) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Modifier.Node next() {
            MutableObjectList mutableObjectList = HitTestResult.this.values;
            int i2 = this.index;
            this.index = i2 + 1;
            Object objNr = mutableObjectList.nr(i2);
            Intrinsics.checkNotNull(objNr, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objNr;
        }

        public /* synthetic */ HitTestResultIterator(HitTestResult hitTestResult, int i2, int i3, int i5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) != 0 ? hitTestResult.size() : i5);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000f\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/ui/node/HitTestResult$SubList;", "", "Landroidx/compose/ui/Modifier$Node;", "", "minIndex", "maxIndex", "<init>", "(Landroidx/compose/ui/node/HitTestResult;II)V", "element", "", "t", "(Landroidx/compose/ui/Modifier$Node;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "O", "(I)Landroidx/compose/ui/Modifier$Node;", "Uo", "(Landroidx/compose/ui/Modifier$Node;)I", "isEmpty", "()Z", "", V8ValueBuiltInSymbol.PROPERTY_ITERATOR, "()Ljava/util/Iterator;", "KN", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", c.f62177j, "I", "getMinIndex", "()I", "getMaxIndex", "J2", "size", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,410:1\n1855#2,2:411\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n323#1:411,2\n*E\n"})
    private final class SubList implements List<Modifier.Node>, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int minIndex;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final int maxIndex;

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void sort(Comparator<? super Modifier.Node> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public SubList(int i2, int i3) {
            this.minIndex = i2;
            this.maxIndex = i3;
        }

        public int J2() {
            return this.maxIndex - this.minIndex;
        }

        public int KN(Modifier.Node element) {
            int i2 = this.maxIndex;
            int i3 = this.minIndex;
            if (i3 > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.nr(i2), element)) {
                if (i2 == i3) {
                    return -1;
                }
                i2--;
            }
            return i2 - this.minIndex;
        }

        @Override // java.util.List
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public Modifier.Node get(int index) {
            Object objNr = HitTestResult.this.values.nr(index + this.minIndex);
            Intrinsics.checkNotNull(objNr, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.Node) objNr;
        }

        public int Uo(Modifier.Node element) {
            int i2 = this.minIndex;
            int i3 = this.maxIndex;
            if (i2 > i3) {
                return -1;
            }
            while (!Intrinsics.areEqual(HitTestResult.this.values.nr(i2), element)) {
                if (i2 == i3) {
                    return -1;
                }
                i2++;
            }
            return i2 - this.minIndex;
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.Node) {
                return t((Modifier.Node) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (!contains((Modifier.Node) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return Uo((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(i2, i2, this.maxIndex);
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.Node) {
                return KN((Modifier.Node) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator<Modifier.Node> listIterator(int index) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new HitTestResultIterator(index + i2, i2, this.maxIndex);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List<Modifier.Node> subList(int fromIndex, int toIndex) {
            HitTestResult hitTestResult = HitTestResult.this;
            int i2 = this.minIndex;
            return hitTestResult.new SubList(fromIndex + i2, i2 + toIndex);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (size() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return J2();
        }

        public boolean t(Modifier.Node element) {
            if (indexOf(element) != -1) {
                return true;
            }
            return false;
        }
    }

    private final long gh() {
        long jRl = HitTestResultKt.rl(Float.POSITIVE_INFINITY, false, false, 4, null);
        int i2 = this.hitDepth + 1;
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (i2 <= lastIndex) {
            while (true) {
                long jRl2 = DistanceAndFlags.rl(this.distanceFromEdgeAndFlags.n(i2));
                if (DistanceAndFlags.n(jRl2, jRl) < 0) {
                    jRl = jRl2;
                }
                if ((DistanceAndFlags.nr(jRl) < 0.0f && DistanceAndFlags.Uo(jRl)) || i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return jRl;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends Modifier.Node> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.hitDepth = -1;
        this.values.Z();
        this.distanceFromEdgeAndFlags.J2();
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<Modifier.Node> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Modifier.Node set(int i2, Modifier.Node node) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(Comparator<? super Modifier.Node> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void XQ(int startDepth, int endDepth) {
        if (startDepth >= endDepth) {
            return;
        }
        this.values.te(startDepth, endDepth);
        this.distanceFromEdgeAndFlags.xMQ(startDepth, endDepth);
    }

    private final void o(int depth) {
        this.values.g(depth);
        this.distanceFromEdgeAndFlags.KN(depth);
    }

    public final void HI(Modifier.Node node, boolean isInLayer, Function0 childHitTest) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            int i2 = this.hitDepth;
            XQ(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.ty(node);
            this.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(0.0f, isInLayer, true));
            childHitTest.invoke();
            this.hitDepth = i2;
            return;
        }
        long jGh = gh();
        int i3 = this.hitDepth;
        if (!DistanceAndFlags.J2(jGh)) {
            if (DistanceAndFlags.nr(jGh) > 0.0f) {
                int i5 = this.hitDepth;
                XQ(this.hitDepth + 1, size());
                this.hitDepth++;
                this.values.ty(node);
                this.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(0.0f, isInLayer, true));
                childHitTest.invoke();
                this.hitDepth = i5;
                return;
            }
            return;
        }
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int i7 = this.hitDepth;
        XQ(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.ty(node);
        this.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(0.0f, isInLayer, true));
        childHitTest.invoke();
        this.hitDepth = i7;
        if (DistanceAndFlags.nr(gh()) < 0.0f) {
            XQ(i3 + 1, this.hitDepth + 1);
        }
        this.hitDepth = i3;
    }

    public final boolean Ik(float distanceFromEdge, boolean isInLayer) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            return true;
        }
        return DistanceAndFlags.n(gh(), HitTestResultKt.rl(distanceFromEdge, isInLayer, false, 4, null)) > 0;
    }

    public final void S(Modifier.Node node, float distanceFromEdge, boolean isInLayer, Function0 childHitTest) {
        if (this.hitDepth == CollectionsKt.getLastIndex(this)) {
            int i2 = this.hitDepth;
            XQ(this.hitDepth + 1, size());
            this.hitDepth++;
            this.values.ty(node);
            this.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(distanceFromEdge, isInLayer, false));
            childHitTest.invoke();
            this.hitDepth = i2;
            if (this.hitDepth + 1 == CollectionsKt.getLastIndex(this) || DistanceAndFlags.J2(gh())) {
                o(this.hitDepth + 1);
                return;
            }
            return;
        }
        long jGh = gh();
        int i3 = this.hitDepth;
        this.hitDepth = CollectionsKt.getLastIndex(this);
        int i5 = this.hitDepth;
        XQ(this.hitDepth + 1, size());
        this.hitDepth++;
        this.values.ty(node);
        this.distanceFromEdgeAndFlags.nr(HitTestResultKt.n(distanceFromEdge, isInLayer, false));
        childHitTest.invoke();
        this.hitDepth = i5;
        long jGh2 = gh();
        if (this.hitDepth + 1 >= CollectionsKt.getLastIndex(this) || DistanceAndFlags.n(jGh, jGh2) <= 0) {
            XQ(this.hitDepth + 1, size());
        } else {
            XQ(i3 + 1, DistanceAndFlags.J2(jGh2) ? this.hitDepth + 2 : this.hitDepth + 1);
        }
        this.hitDepth = i3;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int az() {
        return this.values.get_size();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.Node) {
            return mUb((Modifier.Node) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains((Modifier.Node) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return ck((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.values.Uo();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new HitTestResultIterator(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.Node) {
            return r((Modifier.Node) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<Modifier.Node> listIterator(int index) {
        return new HitTestResultIterator(this, index, 0, 0, 6, null);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Modifier.Node get(int index) {
        Object objNr = this.values.nr(index);
        Intrinsics.checkNotNull(objNr, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.Node) objNr;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<Modifier.Node> subList(int fromIndex, int toIndex) {
        return new SubList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    public int ck(Modifier.Node element) {
        int lastIndex = CollectionsKt.getLastIndex(this);
        if (lastIndex >= 0) {
            int i2 = 0;
            while (!Intrinsics.areEqual(this.values.nr(i2), element)) {
                if (i2 != lastIndex) {
                    i2++;
                } else {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public boolean mUb(Modifier.Node element) {
        if (indexOf(element) != -1) {
            return true;
        }
        return false;
    }

    public int r(Modifier.Node element) {
        for (int lastIndex = CollectionsKt.getLastIndex(this); -1 < lastIndex; lastIndex--) {
            if (Intrinsics.areEqual(this.values.nr(lastIndex), element)) {
                return lastIndex;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return az();
    }

    public final void t() {
        this.hitDepth = size() - 1;
    }

    public final boolean ty() {
        long jGh = gh();
        if (DistanceAndFlags.nr(jGh) < 0.0f && DistanceAndFlags.Uo(jGh) && !DistanceAndFlags.J2(jGh)) {
            return true;
        }
        return false;
    }
}
