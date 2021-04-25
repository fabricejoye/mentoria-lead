import { Pizza } from 'src/app/_models/pizza';

// Dados: sabor, tempo
// [calabresa, 0], [marguerita, 0], [portuguesa, 0]

// Popular a partir da DB

export const PIZZAS: Pizza[] = [
  { id: 1, flavor: 'Calabresa', duration: 0, availability: true, creationDate: new Date()},
  { id: 2, flavor: 'Marguerita', duration: 0, availability: true, creationDate: new Date()},
  { id: 3, flavor: 'Portuguesa', duration: 5, availability: true, creationDate: new Date()},
]
