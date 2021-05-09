import { Pizza_size } from 'src/app/_models/pizza_size';

// Dados: [tamanho, preço, tempo]
// Já preenchidos: [pequena, 20, 15], [média, 20, 30], [grande, 40, 25]

// Popular a partir da DB
const pizzaSizeList = ['pequena', 'média', 'grande'];

export const PIZZAS_SIZE: Pizza_size[] = [
  { id: 1, size: 'Pequena', price: 20, duration: 15, img: "pizza-p.png", creationDate: new Date()},
  { id: 2, size: 'Média', price: 30, duration: 20, img: "pizza-m.png", creationDate: new Date()},
  { id: 3, size: 'Grande', price: 40, duration: 25, img: "pizza-g.png", creationDate: new Date()},
]
