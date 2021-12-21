.include "../framework.asm"
  .ramsection "Definitions" slot 1
    c db ;
    b db ;
    d db ;
    e db ;
  .ends
  .section "main"
    main:
        ld a, 13
        ld (c), a ; 
        ld a, 2
        ld (b), a ; 
        ld a, 10
        ld (d), a ; 
        ld a, 210
        ld (e), a ; 
        push af
        ld a, (c)
        call printByte
  .ends
