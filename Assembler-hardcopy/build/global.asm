.include "../framework.asm"
  .ramsection "Definitions" slot 1
    i db ; 
  .ends
  .section "main"
    main:
        ld a, 3
        ld (i), a
        push af
        ld a, (i)
        call printByte
  .ends
