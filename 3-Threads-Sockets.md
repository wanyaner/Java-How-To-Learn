### Deadlock

what is `deadlock` ? (scenario) How to avoid it?

Situation in which no progress is being made  








01-sleep-and-work  
   slave threads that simulate work by sleeping for random times,
   running in parallel. Illustrates nondeterminism of concurrent programs.

02-racing-counter  
   slave threads sharing a counter object without any synchronization.  
   they "race" to access the counter, interfering with each other.  
   the results are unpredictable.

03-lock-counter  
   shared counter object that is accessed with synchroniztion (locking) in
   the threads. No interference occurs.

04-sync-counter  
   shared counter object whose methods are synchronized.  
   behaves correctly without interference.

05-sync-lock-counter  
   an experiment to see what happens if the methods of counter use separate
   locks instead of a single lock.

06-eating-deadlock  
   two shared objects being locked in opposite order, causes cyclic wait.
   this is called "deadlock" because the program gets stuck without making
   progress.

DiningPhilosophers/deadlocking  
   A more complicated version of cyclic wait.  
   Even though all philosophers lock their objects in the same order,
   deadlock still happens

DiningPhilosophers/good  
   We avoid deadlock here by making one philosopher lock the objects in the
   opposite order.  
   But this can cause the "starvation" problem, a philosopher not being able
   to eat enough because the other philosophers keep using the forks
   alternately.
   