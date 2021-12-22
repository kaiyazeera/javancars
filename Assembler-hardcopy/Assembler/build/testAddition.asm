.include "../framework.asm"
  .ramsection "Definitions" slot 1
    a db
    b db
    c db
    d db
  .ends
  .section "main"
    main:
        ld a, 21
        ld (a), a
        ld a, 21
        ld (b), a
        ld a, (a)
        ld b, a
        ld a, (b)
        add b
        ld (c), a
        ld a, 4
        ld (d), a
        push af
        ld a, (c)
        call printByte
    
  .ends
