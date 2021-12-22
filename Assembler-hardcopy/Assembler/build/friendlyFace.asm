.include "../framework.asm"

.name "Game"

.section "main"
  main:
      ld a, 1
      ld c, 0
      ld b, 2
      call setTile
      ld a, 1
      ld c, 0
      ld b, 5
      call setTile
      ld a, 1
      ld c, 0
      ld b, 8
      call setTile
      ld a, 1
      ld c, 0
      ld b, 9
      call setTile
      ld a, 1
      ld c, 0
      ld b, 10
      call setTile
      ld a, 1
      ld c, 1
      ld b, 1
      call setTile
      ld a, 1
      ld c, 1
      ld b, 3
      call setTile
      ld a, 1
      ld c, 1
      ld b, 5
      call setTile
      ld a, 1
      ld c, 1
      ld b, 6
      call setTile
      ld a, 1
      ld c, 1
      ld b, 7
      call setTile
      ld a, 1
      ld c, 1
      ld b, 8
      call setTile
      ld a, 1
      ld c, 1
      ld b, 9
      call setTile
      ld a, 1
      ld c, 1
      ld b, 10
      call setTile
      ld a, 1
      ld c, 1
      ld b, 11
      call setTile
      ld a, 1
      ld c, 2
      ld b, 0
      call setTile
      ld a, 1
      ld c, 2
      ld b, 1
      call setTile
      ld a, 1
      ld c, 2
      ld b, 2
      call setTile
      ld a, 1
      ld c, 2
      ld b, 3
      call setTile
      ld a, 1
      ld c, 2
      ld b, 4
      call setTile
      ld a, 1
      ld c, 2
      ld b, 5
      call setTile
      ld a, 1
      ld c, 2
      ld b, 6
      call setTile
      ld a, 1
      ld c, 2
      ld b, 11
      call setTile
      ld a, 1
      ld c, 2
      ld b, 12
      call setTile
      ld a, 1
      ld c, 2
      ld b, 13
      call setTile
      ld a, 1
      ld c, 3
      ld b, 1
      call setTile
      ld a, 1
      ld c, 3
      ld b, 2
      call setTile
      ld a, 1
      ld c, 3
      ld b, 3
      call setTile
      ld a, 1
      ld c, 3
      ld b, 5
      call setTile
      ld a, 1
      ld c, 3
      ld b, 14
      call setTile
      ld a, 1
      ld c, 3
      ld b, 15
      call setTile
      ld a, 1
      ld c, 4
      ld b, 0
      call setTile
      ld a, 1
      ld c, 4
      ld b, 2
      call setTile
      ld a, 1
      ld c, 4
      ld b, 4
      call setTile
      ld a, 1
      ld c, 4
      ld b, 8
      call setTile
      ld a, 1
      ld c, 4
      ld b, 16
      call setTile
      ld a, 1
      ld c, 5
      ld b, 1
      call setTile
      ld a, 1
      ld c, 5
      ld b, 4
      call setTile
      ld a, 1
      ld c, 5
      ld b, 7
      call setTile
      ld a, 1
      ld c, 5
      ld b, 17
      call setTile
      ld a, 1
      ld c, 6
      ld b, 0
      call setTile
      ld a, 1
      ld c, 6
      ld b, 3
      call setTile
      ld a, 1
      ld c, 6
      ld b, 7
      call setTile
      ld a, 1
      ld c, 6
      ld b, 13
      call setTile
      ld a, 1
      ld c, 6
      ld b, 17
      call setTile
      ld a, 1
      ld c, 7
      ld b, 0
      call setTile
      ld a, 1
      ld c, 7
      ld b, 3
      call setTile
      ld a, 1
      ld c, 7
      ld b, 7
      call setTile
      ld a, 1
      ld c, 7
      ld b, 14
      call setTile
      ld a, 1
      ld c, 7
      ld b, 17
      call setTile
      ld a, 1
      ld c, 8
      ld b, 0
      call setTile
      ld a, 1
      ld c, 8
      ld b, 2
      call setTile
      ld a, 1
      ld c, 8
      ld b, 8
      call setTile
      ld a, 1
      ld c, 8
      ld b, 11
      call setTile
      ld a, 1
      ld c, 8
      ld b, 14
      call setTile
      ld a, 1
      ld c, 8
      ld b, 17
      call setTile
      ld a, 1
      ld c, 9
      ld b, 0
      call setTile
      ld a, 1
      ld c, 9
      ld b, 1
      call setTile
      ld a, 1
      ld c, 9
      ld b, 10
      call setTile
      ld a, 1
      ld c, 9
      ld b, 12
      call setTile
      ld a, 1
      ld c, 9
      ld b, 14
      call setTile
      ld a, 1
      ld c, 9
      ld b, 17
      call setTile
      ld a, 1
      ld c, 10
      ld b, 0
      call setTile
      ld a, 1
      ld c, 10
      ld b, 14
      call setTile
      ld a, 1
      ld c, 10
      ld b, 17
      call setTile
      ld a, 1
      ld c, 11
      ld b, 0
      call setTile
      ld a, 1
      ld c, 11
      ld b, 1
      call setTile
      ld a, 1
      ld c, 11
      ld b, 8
      call setTile
      ld a, 1
      ld c, 11
      ld b, 14
      call setTile
      ld a, 1
      ld c, 11
      ld b, 17
      call setTile
      ld a, 1
      ld c, 12
      ld b, 0
      call setTile
      ld a, 1
      ld c, 12
      ld b, 2
      call setTile
      ld a, 1
      ld c, 12
      ld b, 7
      call setTile
      ld a, 1
      ld c, 12
      ld b, 13
      call setTile
      ld a, 1
      ld c, 12
      ld b, 17
      call setTile
      ld a, 1
      ld c, 13
      ld b, 0
      call setTile
      ld a, 1
      ld c, 13
      ld b, 3
      call setTile
      ld a, 1
      ld c, 13
      ld b, 7
      call setTile
      ld a, 1
      ld c, 13
      ld b, 17
      call setTile
      ld a, 1
      ld c, 14
      ld b, 1
      call setTile
      ld a, 1
      ld c, 14
      ld b, 4
      call setTile
      ld a, 1
      ld c, 14
      ld b, 8
      call setTile
      ld a, 1
      ld c, 14
      ld b, 16
      call setTile
      ld a, 1
      ld c, 15
      ld b, 2
      call setTile
      ld a, 1
      ld c, 15
      ld b, 5
      call setTile
      ld a, 1
      ld c, 15
      ld b, 14
      call setTile
      ld a, 1
      ld c, 15
      ld b, 15
      call setTile
      ld a, 1
      ld c, 16
      ld b, 3
      call setTile
      ld a, 1
      ld c, 16
      ld b, 4
      call setTile
      ld a, 1
      ld c, 16
      ld b, 6
      call setTile
      ld a, 1
      ld c, 16
      ld b, 12
      call setTile
      ld a, 1
      ld c, 16
      ld b, 13
      call setTile
      ld a, 1
      ld c, 17
      ld b, 5
      call setTile
      ld a, 1
      ld c, 17
      ld b, 7
      call setTile
      ld a, 1
      ld c, 17
      ld b, 8
      call setTile
      ld a, 1
      ld c, 17
      ld b, 9
      call setTile
      ld a, 1
      ld c, 17
      ld b, 10
      call setTile
      ld a, 1
      ld c, 17
      ld b, 11
      call setTile
      ld a, 1
      ld c, 18
      ld b, 6
      call setTile
      ld a, 1
      ld c, 18
      ld b, 9
      call setTile
      ld a, 1
      ld c, 19
      ld b, 7
      call setTile
      ld a, 1
      ld c, 19
      ld b, 8
      call setTile
      call waitVBlank
      ret
  
.ends
