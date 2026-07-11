package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CheckResult;
import com.google.android.exoplayer2.util.FlagSet;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class ListenerSet<T> {
    private static final int MSG_ITERATION_FINISHED = 0;
    private final Clock clock;
    private final ArrayDeque<Runnable> flushingEvents;
    private final HandlerWrapper handler;
    private final IterationFinishedEvent<T> iterationFinishedEvent;
    private final CopyOnWriteArraySet<j> listeners;
    private final ArrayDeque<Runnable> queuedEvents;
    private boolean released;

    public interface Event<T> {
        void invoke(T t3);
    }

    public interface IterationFinishedEvent<T> {
        void invoke(T t3, FlagSet flagSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f58472n;
        private boolean nr;
        private FlagSet.Builder rl = new FlagSet.Builder();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f58473t;

        /* JADX WARN: Multi-variable type inference failed */
        public void t(IterationFinishedEvent iterationFinishedEvent) {
            this.nr = true;
            if (this.f58473t) {
                iterationFinishedEvent.invoke(this.f58472n, this.rl.build());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || j.class != obj.getClass()) {
                return false;
            }
            return this.f58472n.equals(((j) obj).f58472n);
        }

        public int hashCode() {
            return this.f58472n.hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void n(int i2, Event event) {
            if (this.nr) {
                return;
            }
            if (i2 != -1) {
                this.rl.add(i2);
            }
            this.f58473t = true;
            event.invoke(this.f58472n);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void rl(IterationFinishedEvent iterationFinishedEvent) {
            if (this.nr || !this.f58473t) {
                return;
            }
            FlagSet flagSetBuild = this.rl.build();
            this.rl = new FlagSet.Builder();
            this.f58473t = false;
            iterationFinishedEvent.invoke(this.f58472n, flagSetBuild);
        }

        public j(Object obj) {
            this.f58472n = obj;
        }
    }

    public ListenerSet(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this(new CopyOnWriteArraySet(), looper, clock, iterationFinishedEvent);
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, IterationFinishedEvent<T> iterationFinishedEvent) {
        return copy(looper, this.clock, iterationFinishedEvent);
    }

    private ListenerSet(CopyOnWriteArraySet<j> copyOnWriteArraySet, Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        this.clock = clock;
        this.listeners = copyOnWriteArraySet;
        this.iterationFinishedEvent = iterationFinishedEvent;
        this.flushingEvents = new ArrayDeque<>();
        this.queuedEvents = new ArrayDeque<>();
        this.handler = clock.createHandler(looper, new Handler.Callback() { // from class: com.google.android.exoplayer2.util.n
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f58484n.handleMessage(message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        Iterator<j> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().rl(this.iterationFinishedEvent);
            if (this.handler.hasMessages(0)) {
                return true;
            }
        }
        return true;
    }

    public void add(T t3) {
        if (this.released) {
            return;
        }
        Assertions.checkNotNull(t3);
        this.listeners.add(new j(t3));
    }

    public void clear() {
        this.listeners.clear();
    }

    @CheckResult
    public ListenerSet<T> copy(Looper looper, Clock clock, IterationFinishedEvent<T> iterationFinishedEvent) {
        return new ListenerSet<>(this.listeners, looper, clock, iterationFinishedEvent);
    }

    public void flushEvents() {
        if (this.queuedEvents.isEmpty()) {
            return;
        }
        if (!this.handler.hasMessages(0)) {
            HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(0));
        }
        boolean zIsEmpty = this.flushingEvents.isEmpty();
        this.flushingEvents.addAll(this.queuedEvents);
        this.queuedEvents.clear();
        if (zIsEmpty) {
            while (!this.flushingEvents.isEmpty()) {
                this.flushingEvents.peekFirst().run();
                this.flushingEvents.removeFirst();
            }
        }
    }

    public void queueEvent(final int i2, final Event<T> event) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.listeners);
        this.queuedEvents.add(new Runnable() { // from class: com.google.android.exoplayer2.util.j
            @Override // java.lang.Runnable
            public final void run() {
                ListenerSet.n(copyOnWriteArraySet, i2, event);
            }
        });
    }

    public void release() {
        Iterator<j> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().t(this.iterationFinishedEvent);
        }
        this.listeners.clear();
        this.released = true;
    }

    public void remove(T t3) {
        for (j jVar : this.listeners) {
            if (jVar.f58472n.equals(t3)) {
                jVar.t(this.iterationFinishedEvent);
                this.listeners.remove(jVar);
            }
        }
    }

    public int size() {
        return this.listeners.size();
    }

    public static /* synthetic */ void n(CopyOnWriteArraySet copyOnWriteArraySet, int i2, Event event) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((j) it.next()).n(i2, event);
        }
    }

    public void sendEvent(int i2, Event<T> event) {
        queueEvent(i2, event);
        flushEvents();
    }
}
