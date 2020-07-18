FIB-HEAP-INSERT.H; x/
1 x:degree D 0
2 x:p D NIL
3 x:child D NIL
4 x:mark D FALSE
5 if H:min == NIL
6 create a root list for H containing just x
7 H:min D x
8 else insert x into H’s root list
9 if x:key < H:min:key
10 H:min D x
11 H:n D H:n C 1
