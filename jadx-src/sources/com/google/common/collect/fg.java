package com.google.common.collect;

import com.google.common.collect.Md;
import com.google.common.collect.psW;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class fg {

    static class j extends Md.w6 implements SortedSet {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final gnv f59699n;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Md.w6
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final gnv rl() {
            return this.f59699n;
        }

        j(gnv gnvVar) {
            this.f59699n = gnvVar;
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return rl().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return fg.nr(rl().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return rl().Mx(obj, EnumC1898o.OPEN).elementSet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return Md.nr(rl().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        public Object last() {
            return fg.nr(rl().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return rl().p5(obj, EnumC1898o.CLOSED, obj2, EnumC1898o.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return rl().GD(obj, EnumC1898o.CLOSED).elementSet();
        }
    }

    static class n extends j implements NavigableSet {
        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new n(rl().FX());
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z2) {
            return new n(rl().Mx(obj, EnumC1898o.rl(z2)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z2, Object obj2, boolean z3) {
            return new n(rl().p5(obj, EnumC1898o.rl(z2), obj2, EnumC1898o.rl(z3)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z2) {
            return new n(rl().GD(obj, EnumC1898o.rl(z2)));
        }

        n(gnv gnvVar) {
            super(gnvVar);
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return fg.t(rl().GD(obj, EnumC1898o.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return fg.t(rl().Mx(obj, EnumC1898o.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return fg.t(rl().GD(obj, EnumC1898o.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return fg.t(rl().Mx(obj, EnumC1898o.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return fg.t(rl().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return fg.t(rl().pollLastEntry());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object nr(psW.j jVar) {
        if (jVar != null) {
            return jVar.getElement();
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object t(psW.j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.getElement();
    }
}
